package com.crick.app.CricketInformer.controllers;

import com.crick.app.CricketInformer.entities.Match;
import com.crick.app.CricketInformer.services.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    public MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
//    get live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatch()
    {
        System.out.println("hii");
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }

//    get all matches
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }

//    get point table
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, World!";
    }
}
