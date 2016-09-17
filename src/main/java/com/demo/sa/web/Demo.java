package com.demo.sa.web;

import com.demo.sa.domian.Amphur;
import com.demo.sa.domian.Customer;
import com.demo.sa.domian.Province;
import flexjson.JSONSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

import static com.demo.sa.domian.Amphur.findAllAmphurs;
import static com.demo.sa.domian.Amphur.findAmphur;
import static com.demo.sa.domian.Amphur.findAmphursByNameLike;
import static com.demo.sa.domian.Province.findAllProvinces;
import static com.demo.sa.domian.Province.findProvincesByNameLike;

/**
 * Created by Mooxx on 9/15/2016 AD.
 */
@RooJavaBean
@RooToString
@RequestMapping("/demo")
@Controller
public class Demo {
    @RequestMapping(value = "/sa", produces = "text/html")
    public String viewDemo(Model uiModel) {
        List<Province> listProvince = findAllProvinces();
        List<Customer> listCustomer = Customer.findAllCustomers();
        uiModel.addAttribute("listCustomer",listCustomer);
        uiModel.addAttribute("listProvince",listProvince);
        return "demo/sa";
    }

    @RequestMapping(value = "/checkAmphur",method = RequestMethod.GET,produces = "text/html")
    public ResponseEntity<String> checkAmphur(@RequestParam(value = "province", required = false) String province) {
        List<Amphur> listAmphurall = findAllAmphurs();
        List<Amphur> listAmphur = new ArrayList<Amphur>();
        for (Amphur am: listAmphurall
             ) {
            if(am.getProvince().getName().equals(province)){
               listAmphur.add(am);
            }
        }

        System.out.println("xxxxxxxxxxxxx method get xxxxxxxxxxx");
        return new ResponseEntity<String>(new JSONSerializer().exclude("*.class").deepSerialize(listAmphur), HttpStatus.OK);
    }

    @RequestMapping(value = "/createCustomer",method = RequestMethod.POST,produces = "text/html")
    public String createCustomer(@Valid Customer customer, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletReques){
        Customer ct = new Customer();
        Amphur am = Amphur.findAmphur(customer.getAmphur().getId());
        ct.setFirstName(customer.getFirstName());
        ct.setLastName(customer.getLastName());
        ct.setAddress(customer.getAddress());
        ct.setAmphur(am);
        ct.persist();
        return "demo/sa";
    }

    @RequestMapping(value = "/deleteCustomer",method = RequestMethod.GET,produces = "text/html")
    public String deleteCustomer(Model uiModel, @RequestParam(value = "idCustomer", required = false) String idCustomer){
        System.out.println(Customer.findCustomer(Long.valueOf(idCustomer)));
        Customer cs = Customer.findCustomer(Long.valueOf(idCustomer));
        cs.remove();
        List<Customer> listCustomer = Customer.findAllCustomers();
        uiModel.addAttribute("listCustomer",listCustomer);
        return "demo/sa";
    }


    @RequestMapping(value = "/sa1", produces = "text/html")
    public String viewDemo1(Model uiModel) {
        return "demo/sa1";
    }

    @RequestMapping(value = "/sa2", produces = "text/html")
    public String viewDemo2(Model uiModel) {
        return "demo/sa2";
    }

    //////////////////////////////////////////////////// Amphur ///////////////////////////////////////////////////

    @RequestMapping(value = "/amphur", produces = "text/html")
    public String viewAmphur(Model uiModel) {
        List<Amphur> listAmphur = findAllAmphurs();
        uiModel.addAttribute("listAmphur",listAmphur);
        return "demo/amphur";
    }

    @RequestMapping(value = "/addamphur",method = RequestMethod.GET,produces = "text/html")
    public ResponseEntity<String> addAmphur(Model uiModel, @RequestParam(value = "amphur", required = false) String amphur, @RequestParam(value = "province", required = false) Long province ,@RequestParam(value = "postalcode", required = false) String postalcode) {
        Amphur am = new Amphur();
        Province pv = Province.findProvince(Long.valueOf(province));
        am.setName(amphur);
        am.setPostal_code(postalcode);
        am.setProvince(pv);
        am.persist();
        List<Amphur> listAmphur = findAllAmphurs();
        return  new ResponseEntity<String>(new JSONSerializer().exclude("*.class").deepSerialize(listAmphur), HttpStatus.OK);

    }



    @RequestMapping(value = "/findamphur",method = RequestMethod.GET,produces = "text/html")
    public ResponseEntity<String> findAmphur(Model uiModel, @RequestParam(value = "amphur", required = false) String amphur) {
        List<Amphur> listAmphur = findAmphursByNameLike(amphur).getResultList();
        if(listAmphur.size() == 0){
            return  new ResponseEntity<String>(new JSONSerializer().exclude("*.class").deepSerialize(findAllAmphurs()), HttpStatus.OK);
        }else{
            return  new ResponseEntity<String>(new JSONSerializer().exclude("*.class").deepSerialize(listAmphur), HttpStatus.OK);
        }
    }
    /////////////////////////////////////////////////////=====/////////////////////////////////////////////////////


    //////////////////////////////////////////////////// Province ///////////////////////////////////////////////////

    @RequestMapping(value = "/province", produces = "text/html")
    public String viewProvince(Model uiModel) {
        List<Province> listProvince = findAllProvinces();
        uiModel.addAttribute("listProvince",listProvince);
        return "demo/province";
    }

    @RequestMapping(value = "/addprovince",method = RequestMethod.GET,produces = "text/html")
    public ResponseEntity<String> addProvince(Model uiModel, @RequestParam(value = "province", required = false) String province) {
        Province pv = new Province();
        pv.setName(province);
        pv.persist();
        List<Province> listProvince = findAllProvinces();
        return  new ResponseEntity<String>(new JSONSerializer().exclude("*.class").deepSerialize(listProvince), HttpStatus.OK);

    }

    @RequestMapping(value = "/findprovince",method = RequestMethod.GET,produces = "text/html")
    public ResponseEntity<String> findProvince(Model uiModel, @RequestParam(value = "province", required = false) String province) {
       List<Province> listProvince = findProvincesByNameLike(province).getResultList();
        if(listProvince.size() == 0){
            return  new ResponseEntity<String>(new JSONSerializer().exclude("*.class").deepSerialize(findAllProvinces()), HttpStatus.OK);
        }else{
            return  new ResponseEntity<String>(new JSONSerializer().exclude("*.class").deepSerialize(listProvince), HttpStatus.OK);
        }
    }

    /////////////////////////////////////////////////////=====/////////////////////////////////////////////////////
}
