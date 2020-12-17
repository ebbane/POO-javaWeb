package com.locy.Locy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.locy.Locy.model.Annonce;
import com.locy.Locy.repository.AnnonceRepository;
 
@Service
@Transactional
public class AnnonceService {
	@Autowired
	private AnnonceRepository repo;
	
	public List<Annonce> listAll() {
		return repo.findAll();
	}
	
	public void save(Annonce annonce) {
		repo.save(annonce);
	}

	public Annonce get(long id) {
		return repo.findById(id).get();
	}

	public void delete(long id) {
		repo.deleteById(id);
	}
}
