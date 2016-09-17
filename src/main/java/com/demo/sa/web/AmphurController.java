package com.demo.sa.web;
import com.demo.sa.domian.Amphur;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/amphurs")
@Controller
@RooWebScaffold(path = "amphurs", formBackingObject = Amphur.class)
public class AmphurController {
}
