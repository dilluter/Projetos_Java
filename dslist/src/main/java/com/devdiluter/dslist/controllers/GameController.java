package com.devdiluter.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devdiluter.dslist.dto.GameDTO;
import com.devdiluter.dslist.dto.GameMinDTO;
import com.devdiluter.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable long id) {
        return gameService.findById(id);
    }
    
    @GetMapping
    public List<GameMinDTO> findAll() {
    	List<GameMinDTO> result = gameService.findAll();
		return result;
    }
}



