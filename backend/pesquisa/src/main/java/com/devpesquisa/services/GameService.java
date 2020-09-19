package com.devpesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devpesquisa.dto.GameDto;
import com.devpesquisa.entities.Game;
import com.devpesquisa.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	@Transactional(readOnly = true)
	public List<GameDto> findAll() {
		List<Game> list = repository.findAll();
		return list.stream().map(x -> new GameDto(x)).collect(Collectors.toList());
	}

}
