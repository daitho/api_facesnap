package com.example.facesnap.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usersnap")
public class Facesnap {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	//@Column(name = "description")
	private String description;
	
	@Column(name = "imgurl")
	private String imgUrl;
	
	@Column(name = "createddate")
	private Date createdDate;
	
	//@Column(name = "snap")
	private Integer snap;
	
	//@Column(name = "localisation")
	private String localisation;
	
	
	
	public Facesnap() {
	}

	public Facesnap(Integer id, String title, String description, String imgUrl, Date createdDate, int snap,
			String localisation) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.imgUrl = imgUrl;
		this.createdDate = createdDate;
		this.snap = snap;
		this.localisation = localisation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getSnap() {
		return snap;
	}

	public void setSnap(Integer snap) {
		this.snap = snap;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
	
	
	
	

}
