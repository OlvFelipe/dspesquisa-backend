package com.devpesquisa.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devpesquisa.dto.RecordDto;
import com.devpesquisa.dto.RecordInsertDto;
import com.devpesquisa.entities.Game;
import com.devpesquisa.entities.Record;
import com.devpesquisa.repositories.GameRepository;
import com.devpesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDto insert(RecordInsertDto dto) {
		Record entity = new Record();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDto(entity);
	}
	
	public List<RecordDto> findAll() {
		List<Record> list = repository.findAll();
		return list.stream().map(x -> new RecordDto(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Page<RecordDto> findByMoment(Instant minDate, Instant maxDate, PageRequest pageRequest) {
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDto(x));
	}

}
