package mx.com.leonrv3.hackocean_mapamb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ReportController {
    
    @GetMapping(value="/saludar")
    public String saludar() {
        return "Holaaaa";
    }

}
