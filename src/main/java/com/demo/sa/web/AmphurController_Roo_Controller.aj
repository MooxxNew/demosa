// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.demo.sa.web;

import com.demo.sa.domian.Amphur;
import com.demo.sa.domian.Province;
import com.demo.sa.web.AmphurController;
import java.io.UnsupportedEncodingException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriUtils;
import org.springframework.web.util.WebUtils;

privileged aspect AmphurController_Roo_Controller {
    
    @RequestMapping(method = RequestMethod.POST, produces = "text/html")
    public String AmphurController.create(@Valid Amphur amphur, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, amphur);
            return "amphurs/create";
        }
        uiModel.asMap().clear();
        amphur.persist();
        return "redirect:/amphurs/" + encodeUrlPathSegment(amphur.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(params = "form", produces = "text/html")
    public String AmphurController.createForm(Model uiModel) {
        populateEditForm(uiModel, new Amphur());
        return "amphurs/create";
    }
    
    @RequestMapping(value = "/{id}", produces = "text/html")
    public String AmphurController.show(@PathVariable("id") Long id, Model uiModel) {
        uiModel.addAttribute("amphur", Amphur.findAmphur(id));
        uiModel.addAttribute("itemId", id);
        return "amphurs/show";
    }
    
    @RequestMapping(produces = "text/html")
    public String AmphurController.list(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, @RequestParam(value = "sortFieldName", required = false) String sortFieldName, @RequestParam(value = "sortOrder", required = false) String sortOrder, Model uiModel) {
        if (page != null || size != null) {
            int sizeNo = size == null ? 10 : size.intValue();
            final int firstResult = page == null ? 0 : (page.intValue() - 1) * sizeNo;
            uiModel.addAttribute("amphurs", Amphur.findAmphurEntries(firstResult, sizeNo, sortFieldName, sortOrder));
            float nrOfPages = (float) Amphur.countAmphurs() / sizeNo;
            uiModel.addAttribute("maxPages", (int) ((nrOfPages > (int) nrOfPages || nrOfPages == 0.0) ? nrOfPages + 1 : nrOfPages));
        } else {
            uiModel.addAttribute("amphurs", Amphur.findAllAmphurs(sortFieldName, sortOrder));
        }
        return "amphurs/list";
    }
    
    @RequestMapping(method = RequestMethod.PUT, produces = "text/html")
    public String AmphurController.update(@Valid Amphur amphur, BindingResult bindingResult, Model uiModel, HttpServletRequest httpServletRequest) {
        if (bindingResult.hasErrors()) {
            populateEditForm(uiModel, amphur);
            return "amphurs/update";
        }
        uiModel.asMap().clear();
        amphur.merge();
        return "redirect:/amphurs/" + encodeUrlPathSegment(amphur.getId().toString(), httpServletRequest);
    }
    
    @RequestMapping(value = "/{id}", params = "form", produces = "text/html")
    public String AmphurController.updateForm(@PathVariable("id") Long id, Model uiModel) {
        populateEditForm(uiModel, Amphur.findAmphur(id));
        return "amphurs/update";
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "text/html")
    public String AmphurController.delete(@PathVariable("id") Long id, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "size", required = false) Integer size, Model uiModel) {
        Amphur amphur = Amphur.findAmphur(id);
        amphur.remove();
        uiModel.asMap().clear();
        uiModel.addAttribute("page", (page == null) ? "1" : page.toString());
        uiModel.addAttribute("size", (size == null) ? "10" : size.toString());
        return "redirect:/amphurs";
    }
    
    void AmphurController.populateEditForm(Model uiModel, Amphur amphur) {
        uiModel.addAttribute("amphur", amphur);
        uiModel.addAttribute("provinces", Province.findAllProvinces());
    }
    
    String AmphurController.encodeUrlPathSegment(String pathSegment, HttpServletRequest httpServletRequest) {
        String enc = httpServletRequest.getCharacterEncoding();
        if (enc == null) {
            enc = WebUtils.DEFAULT_CHARACTER_ENCODING;
        }
        try {
            pathSegment = UriUtils.encodePathSegment(pathSegment, enc);
        } catch (UnsupportedEncodingException uee) {}
        return pathSegment;
    }
    
}
