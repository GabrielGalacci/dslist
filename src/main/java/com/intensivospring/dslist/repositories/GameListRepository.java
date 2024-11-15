package com.intensivospring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivospring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
