package com.alexandresantato.gameslist.services;

import com.alexandresantato.gameslist.dto.GameDTO;
import com.alexandresantato.gameslist.dto.GameMinDTO;
import com.alexandresantato.gameslist.entities.Game;
import com.alexandresantato.gameslist.projections.GameMinProjection;
import com.alexandresantato.gameslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> listResultSql = gameRepository.findAll();
        List<GameMinDTO> listGameMinDTOs = listResultSql.stream().map(x -> new GameMinDTO(x)).toList();
        return listGameMinDTOs;
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByGameList(Long gameListId) {
        List<GameMinProjection> listResultSql = gameRepository.searchByGameList(gameListId);
        List<GameMinDTO> listGameMinDTOs = listResultSql.stream().map(x -> new GameMinDTO(x)).toList();
        return listGameMinDTOs;
    }
}
