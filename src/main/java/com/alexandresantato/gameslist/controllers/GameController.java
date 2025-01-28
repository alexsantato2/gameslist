package com.alexandresantato.gameslist.controllers;

import com.alexandresantato.gameslist.dto.GameMinDTO;
import com.alexandresantato.gameslist.entities.Game;
import com.alexandresantato.gameslist.services.GameService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {

        return gameService.findAll();
    }
}
