package com.goreligious.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "puja_details_pd")
public class PujaDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long pujaId;
	private String pujaName;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pujaid")
	public Long getPujaId() {
		return pujaId;
	}

	public void setPujaId(Long pujaId) {
		this.pujaId = pujaId;
	}

	@Column(name = "pujaname")
	public String getPujaName() {
		return pujaName;
	}

	public void setPujaName(String pujaName) {
		this.pujaName = pujaName;
	}

}
