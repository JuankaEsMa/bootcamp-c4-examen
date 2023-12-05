package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Videojuego;
import com.example.demo.service.VideojuegoService;

@RestController
@RequestMapping("videojuego")
public class VideojuegoController {
	@Autowired
	VideojuegoService service;
	
	@GetMapping("/{nombre}")
	public List<Videojuego> findByName(@PathVariable String nombre){
		return service.findByNombre(nombre);
	}
}
