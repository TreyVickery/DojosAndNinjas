package com.codingdojo.DojoNinjas.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.DojoNinjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();
}
