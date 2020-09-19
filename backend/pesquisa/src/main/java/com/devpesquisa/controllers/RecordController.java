package com.devpesquisa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devpesquisa.dto.RecordDto;
import com.devpesquisa.dto.RecordInsertDto;
import com.devpesquisa.services.RecordService;

@RestController
@RequestMapping(value = "/records")
public class RecordController {

	@Autowired
	private RecordService service;
	
	@PostMapping
	public ResponseEntity<RecordDto> insert(@RequestBody RecordInsertDto dto) {
		RecordDto newDto = service.insert(dto);
		return ResponseEntity.ok().body(newDto);
	}
	
}
