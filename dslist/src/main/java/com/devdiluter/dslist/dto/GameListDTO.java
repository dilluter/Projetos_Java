 package com.devdiluter.dslist.dto;

import com.devdiluter.dslist.entities.GameList;

public class GameListDTO {

	private long id;
	private String name;
	
	public GameListDTO() {
	}

	public GameListDTO(GameList result) {
		id = result.getId();
		name = result.getName();
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
