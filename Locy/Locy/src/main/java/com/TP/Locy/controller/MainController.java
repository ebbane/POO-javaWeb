package com.TP.Locy.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MainController {


    // Injectez (inject) via application.properties.
    @Value("${welcome.message.bienvenue}")
    private String message;
 
    @Value("${error.message}")
    private String errorMessage;
 
    @RequestMapping(value = { "/", "/homepage" })
    public String homepage() {
        return "homepage";
    }
    
    @RequestMapping(value = { "/annonce", "/annonceList" })
    public String annonceList() {
        return "annonceList";
    }
    
    @RequestMapping(value = { "/add", "/addAnnonce" })
    public String addAnnonce() {
        return "addAnnonce";
    }
}
