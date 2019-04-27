package com.goreligious.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.goreligious.app.entity.PujaDetails;

@Repository
public interface PujaDetailsRepository extends JpaRepository<PujaDetails, Long> {
	List<PujaDetails> findAll();
}
