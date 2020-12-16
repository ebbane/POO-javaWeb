package com.locy.Locy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@Autowired
    private AnnonceService service;
     
    @RequestMapping("/")
    public String viewHomePage(Model model) {
    	List<Annonce> listAnnonces= service.listAll();
        model.addAttribute("listAnnonces", listAnnonces);
    	return "index";
    }
}
