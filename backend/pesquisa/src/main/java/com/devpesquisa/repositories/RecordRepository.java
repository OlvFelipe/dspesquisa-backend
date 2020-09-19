package com.devpesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devpesquisa.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{
	
}
