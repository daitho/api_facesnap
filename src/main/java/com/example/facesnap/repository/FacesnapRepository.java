package com.example.facesnap.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.facesnap.model.Facesnap;

@Repository
public interface FacesnapRepository extends CrudRepository<Facesnap, Integer>{

}
