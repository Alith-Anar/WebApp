package com.mycompany.honey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HoneyDataController {
    @Autowired HoneyDataService service;

    @PostMapping("/save")
    public String saveData(HoneySorts sorts) {
        service.saveData(sorts);
        return "redirect:/index";
    }
}
