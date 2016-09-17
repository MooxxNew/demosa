package com.demo.sa.web;
import com.demo.sa.domian.Province;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/provinces")
@Controller
@RooWebScaffold(path = "provinces", formBackingObject = Province.class)
public class ProvinceController {
}
