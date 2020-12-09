package com.ynov.SpringBootLiveCoding.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ynov.SpringBootLiveCoding.form.EtudiantForm;
import com.ynov.SpringBootLiveCoding.model.Etudiant;
 
@Controller
public class MainController {
 
	//------------------------------------------------------------------------
	// 1. Injection des données statiques (car pas de BDD)
    private static List<Etudiant> etudiants = new ArrayList<Etudiant>();
 
    static {
    	// 1ere façon de faire
    	Etudiant etudiant1 = new Etudiant("Alain", "Terrieur");
    	etudiants.add(etudiant1);
    	// 2e façon de faire
    	etudiants.add(new Etudiant("Alex", "Terrieur"));
    }
   //--------------------------------------------------------------------------
 
    // Injectez (inject) via application.properties.
    @Value("${welcome.message.bienvenue}")
    private String message;
 
    @Value("${error.message}")
    private String errorMessage;
 
    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {
 
        model.addAttribute("message", message);
 
        return "index";
    }
 
    @RequestMapping(value = { "/etudiantList" }, method = RequestMethod.GET)
    public String etudiantList(Model model) {
 
        model.addAttribute("etudiants", etudiants);
 
        return "etudiantList";
    }
 
    @RequestMapping(value = { "/addEtudiant" }, method = RequestMethod.GET)
    public String showAddEtudiantPage(Model model) {
 
        EtudiantForm etudiantForm = new EtudiantForm();
        model.addAttribute("etudiantForm", etudiantForm);
 
        return "addEtudiant";
    }
 
    @RequestMapping(value = { "/addEtudiant" }, method = RequestMethod.POST)
    public String saveEtudiant(Model model, //
            @ModelAttribute("EtudiantForm") EtudiantForm etudiantForm) {
 
        String nom = etudiantForm.getNom();
        String prenom = etudiantForm.getPrenom();
 
        if (nom != null && nom.length() > 0 //
                && prenom != null && prenom.length() > 0) {
            Etudiant newEtudiant = new Etudiant(nom, prenom);
            etudiants.add(newEtudiant);
 
            return "redirect:/etudiantList";
        }
 
        model.addAttribute("errorMessage", errorMessage);
        return "addEtudiant";
    }
 
}