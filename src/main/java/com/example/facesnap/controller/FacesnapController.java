package com.example.facesnap.controller;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.facesnap.model.Facesnap;
import com.example.facesnap.service.FacesnapService;

@RestController
public class FacesnapController {
	
	@Autowired
	private FacesnapService facesnapService;
	
	/**
	 * Create - Add a new facesnap
	 * @param employee An object facesnap
	 * @return the facesnap object saved
	 */
	@PostMapping("/facesnap")
	public Facesnap createFacesnap(@RequestBody Facesnap facesnap) {
		return facesnapService.saveFacesnap(facesnap);
	}
	
	/**
	 * Read  - Get one Face snap
	 * @param id of the face snap
	 * @return An face snap object full filled
	 */
	@GetMapping("/facesnap/{id}")
	public Facesnap getFacesnap(@PathVariable("id") final Integer id) {
		Optional<Facesnap> facesnap = facesnapService.getFacesnap(id);
		if(facesnap.isPresent()) {
			return facesnap.get();
		}
		return null;
	}
	
	/**
	 * Read - recupère tous les facesnap
	 * @return - An Interable object of Employee full filled
	 */
	@GetMapping("/facesnaps")
	public Iterable<Facesnap> getFacesnaps(){
		return facesnapService.getFacesnaps();
	}
	
	/**
	 * Delete - Delete an facesnap
	 * @param id - The id of the facesnap to delete
	 */
	@DeleteMapping("/facesnap/{id}")
	public void deleteFacesnap(@PathVariable("id") final Integer id) {
		facesnapService.deleteFacesnap(id);
	}
	
	/**
	 * Update - Update an existing facesnap
	 * @param id - The id of the facesnap to update
	 * @param facesnap - The facesnap object updated
	 * @return
	 */
	@PutMapping("/facesnap/{id}")
	public Facesnap updateEmployee(@PathVariable("id") final Integer id, @RequestBody Facesnap facesnap) {
		Optional<Facesnap> e = facesnapService.getFacesnap(id);
		if(e.isPresent()) {
			Facesnap currentfacesnap = e.get();
			
			String title = facesnap.getTitle();
			if(title != null) {
				currentfacesnap.setTitle(title);
			}
			String description = facesnap.getDescription();
			if(description != null) {
				currentfacesnap.setDescription(description);;
			}
			String imgUrl = facesnap.getImgUrl();
			if(imgUrl != null) {
				currentfacesnap.setImgUrl(imgUrl);
			}
			Date createdDate = facesnap.getCreatedDate();
			if(createdDate.toString() != null) {
				currentfacesnap.setCreatedDate(createdDate);
			}
			Integer snap = facesnap.getSnap();
			if(snap != null) {
				currentfacesnap.setSnap(snap);
			}
			String localisation = facesnap.getLocalisation();
			if(localisation != null) {
				currentfacesnap.setLocalisation(localisation);;
			}
			facesnapService.saveFacesnap(currentfacesnap);
			return currentfacesnap;
		} else {
			return null;
		}
	}

}
