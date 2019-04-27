package com.goreligious.app.controller;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goreligious.app.entity.PujaDetails;
import com.goreligious.app.repo.PujaDetailsRepository;

@RestController
public class Controller {
	@Autowired
	PujaDetailsRepository pujaDetailsRepository;
	
	@RequestMapping("/get")
	public Serializable get() {
		List<PujaDetails> pujaDetailsList = pujaDetailsRepository.findAll();
		return (Serializable) pujaDetailsList;
	}

}
