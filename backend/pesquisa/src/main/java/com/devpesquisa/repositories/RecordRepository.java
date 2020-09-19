package com.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devpesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
