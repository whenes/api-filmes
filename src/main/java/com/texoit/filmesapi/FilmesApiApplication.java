package com.texoit.filmesapi;

import com.texoit.filmesapi.services.CarregarDadosFilmesBanco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class FilmesApiApplication {

	@Autowired
	private CarregarDadosFilmesBanco carregarDadosFilmesBanco;

	public static void main(String[] args) {
		SpringApplication.run(FilmesApiApplication.class, args);
	}

	@PostConstruct
	public void carregarFilmesNoBanco() {
		carregarDadosFilmesBanco.lerDadosMemoria();
	}

}
