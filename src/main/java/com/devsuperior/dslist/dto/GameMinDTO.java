package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

//classe que não ficará mapeada com o banco, criada para mostrar apenas os dados abaixo,
// economiza tráfego na api
public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	
	public GameMinDTO() {
	}


	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		
	}


	// gerar somente os getters para o DTO
	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}
		
	
}




