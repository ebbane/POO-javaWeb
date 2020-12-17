package com.locy.Locy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.locy.Locy.model.Annonce;
import com.locy.Locy.service.AnnonceService;

@Controller
public class AppController {
	
	@Autowired
    private AnnonceService service;
     
    @RequestMapping("/")
    public String viewHomePage(Model model) {
    	return "homepage";
    }
    @RequestMapping("/annonces")
    public String viewAnnonce(Model model) {
    	List<Annonce> listAnnonces= service.listAll();
        model.addAttribute("listAnnonces", listAnnonces);
    	return "annonce_list";
    }
    
    @RequestMapping("/new")
    public String showNewAnnoncePage(Model model) {
        Annonce annonce = new Annonce();
        model.addAttribute("annonce", annonce);        
        return "new_annonce";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAnnonce(@ModelAttribute("annonce") Annonce annonce) {
        service.save(annonce);   
        return "redirect:/annonces";
    }
    
    @RequestMapping("/annonce/{id}")
    public ModelAndView showOne(@PathVariable long id) {
        ModelAndView mav = new ModelAndView("show_annonce");
        Annonce annonce= service.get(id);
        mav.addObject("annonce", annonce);         
        return mav;
    }
    
    
    @RequestMapping("/edit/{id}")
    public ModelAndView showEditAnnoncePage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("edit_annonce");
        Annonce annonce= service.get(id);
        mav.addObject("annonce", annonce);         
        return mav;
    }
    
    @RequestMapping("/delete/{id}")
    public String deleteAnnonce(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/annonces";       
    }
    
    @RequestMapping("/connexion")
    public String logIn(Model model) {
    	return "connexion";
    }
}
