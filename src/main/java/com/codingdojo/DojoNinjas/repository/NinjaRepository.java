package com.codingdojo.DojoNinjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.DojoNinjas.models.Dojo;
import com.codingdojo.DojoNinjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}
