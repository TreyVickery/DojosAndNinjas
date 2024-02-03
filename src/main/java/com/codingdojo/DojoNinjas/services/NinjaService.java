package com.codingdojo.DojoNinjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.DojoNinjas.models.Dojo;
import com.codingdojo.DojoNinjas.models.Ninja;
import com.codingdojo.DojoNinjas.repository.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository repo;
    
    public NinjaService(NinjaRepository repo) {
        this.repo = repo;
    }
    // returns all the books
    public List<Ninja> all() {
        return repo.findAll();
    }
    // creates a book
    public Ninja create(Ninja ninja) {
        return repo.save(ninja);
    }
    // retrieves a book
    public Ninja find(Long id) {
        Optional<Ninja> result = repo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    public List<Ninja> byDojo(Dojo dojo) {
    	return repo.findAllByDojo(dojo);
    }
	public Ninja create1(Ninja ninja) {
		// TODO Auto-generated method stub
		return null;
	}
}
