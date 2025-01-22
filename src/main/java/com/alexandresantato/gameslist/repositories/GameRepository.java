package com.alexandresantato.gameslist.repositories;

import com.alexandresantato.gameslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
