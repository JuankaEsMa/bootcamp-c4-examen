package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Partida;
import com.example.demo.dto.Videojuego;
import com.example.demo.service.PartidaService;
import com.example.demo.service.VideojuegoService;

@RestController
@RequestMapping("partida")
public class PartidaController {
	@Autowired
	PartidaService service;
	@Autowired
	VideojuegoService videojuegoService;
	
	@PostMapping("add/{id_videojuego}")
	public Partida createPartida(@RequestBody Partida partida, @PathVariable Integer nombreVideojuego) {
		Videojuego videojuegoAñadir = videojuegoService.getById(nombreVideojuego);
		if(videojuegoAñadir != null) {
			partida.setVideojuego(videojuegoAñadir);
		}
		return service.addPartida(partida);
	}
	@GetMapping("")
	public List<Partida> listPartidas(@RequestParam(name = "videojuego", required = false) Integer videojuegoId){
		if(videojuegoId != null) {
			return service.findByVideojuego(videojuegoService.getById(videojuegoId));
		}
		return service.getAllPartidas();
	}
}
