package com.openclassrooms.bobapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.openclassrooms.bobapp.model.Joke;
import com.openclassrooms.bobapp.service.JokeService;
import com.openclassrooms.bobapp.model.Joke;


@RestController
@RequestMapping("api/joke")
public class JokeController {

    private final JokeService jokeService;

    JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping()
    public Joke getRandomJokes() {
        return this.jokeService.getRandomJoke();
    }
}
