package com.devpesquisa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devpesquisa.dto.GameDto;
import com.devpesquisa.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDto>> findAll() {
		List<GameDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
