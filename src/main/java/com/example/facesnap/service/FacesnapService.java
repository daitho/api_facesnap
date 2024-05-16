package com.example.facesnap.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facesnap.model.Facesnap;
import com.example.facesnap.repository.FacesnapRepository;

import lombok.Data;

@Data
@Service
public class FacesnapService {
	
	@Autowired
	private FacesnapRepository facesnapRepository;
	
	public Optional<Facesnap> getFacesnap(final Integer id){
		return facesnapRepository.findById(id);
	}
	
	public Iterable<Facesnap> getFacesnaps(){
		return facesnapRepository.findAll();
	}
	
	public void deleteFacesnap(final Integer id) {
		facesnapRepository.deleteById(id);
	}
	
	public Facesnap saveFacesnap(Facesnap facesnap) {
		Facesnap savedFacesnap = facesnapRepository.save(facesnap);
		return savedFacesnap;
	}
	

}
