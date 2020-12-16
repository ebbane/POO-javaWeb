package com.locy.Locy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
    
    @RequestMapping("/new")
    public String showNewAnnoncePage(Model model) {
        Annonce annonce = new Annonce();
        model.addAttribute("annonce", annonce);        
        return "new_annonce";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAnnonce(@ModelAttribute("annonce") Annonce annonce) {
        service.save(annonce);   
        return "redirect:/";
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
        return "redirect:/";       
    }
}
