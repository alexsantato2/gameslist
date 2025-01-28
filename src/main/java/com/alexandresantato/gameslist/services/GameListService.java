package com.alexandresantato.gameslist.services;

import com.alexandresantato.gameslist.dto.GameListDTO;
import com.alexandresantato.gameslist.entities.GameList;
import com.alexandresantato.gameslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> listResultSql = gameListRepository.findAll();
        List<GameListDTO> gameListDTOList = listResultSql.stream().map(x -> new GameListDTO(x)).toList();
        return gameListDTOList;
    }

}
