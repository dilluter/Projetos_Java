package com.devdiluter.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devdiluter.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
