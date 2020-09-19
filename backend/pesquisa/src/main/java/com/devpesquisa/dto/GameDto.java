package com.devpesquisa.dto;

import java.io.Serializable;

import com.devpesquisa.entities.Game;
import com.devpesquisa.entities.enums.Platform;

public class GameDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String title;
	private Platform platform;
	
	public GameDto() {
		
	}
	
	public GameDto(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform = entity.getPlatform();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	
	
}