package com.alexandresantato.gameslist.services;

import com.alexandresantato.gameslist.dto.GameMinDTO;
import com.alexandresantato.gameslist.entities.Game;
import com.alexandresantato.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {

        List<Game> listResultSql = gameRepository.findAll();
        List<GameMinDTO> listGameMinDTOs = listResultSql.stream().map(x -> new GameMinDTO(x)).toList();

        return listGameMinDTOs;
    }
}
