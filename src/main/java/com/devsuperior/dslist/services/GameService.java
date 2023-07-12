package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired   //service chama o repository
	private GameRepository gameRepository;
	
	//Service devolve uma lista de games DTO, vai ao BD e já faz tudo
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		//List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
		//return dto;
		
	}
}
