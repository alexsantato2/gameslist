package com.alexandresantato.gameslist.controllers;

import com.alexandresantato.gameslist.dto.GameListDTO;
import com.alexandresantato.gameslist.dto.GameMinDTO;
import com.alexandresantato.gameslist.services.GameListService;
import com.alexandresantato.gameslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gameLists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findALl() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{gameListId}/games")
    public List<GameMinDTO> findByGameList(@PathVariable Long gameListId) {
        return gameService.findByGameList(gameListId);
    }
}
