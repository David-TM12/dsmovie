package com.davidmagalhaes.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davidmagalhaes.dsmovie.dto.MovieDTO;
import com.davidmagalhaes.dsmovie.dto.ScoreDTO;
import com.davidmagalhaes.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO objDto){
		MovieDTO movieDTO = scoreService.saveScore(objDto);
		return movieDTO;
	}
}
