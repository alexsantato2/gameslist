package com.alexandresantato.gameslist.controllers;

import com.alexandresantato.gameslist.dto.GameListDTO;
import com.alexandresantato.gameslist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gameLists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findALl() {
        return gameListService.findAll();
    }


}
