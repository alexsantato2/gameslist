package com.alexandresantato.gameslist.repositories;

import com.alexandresantato.gameslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
