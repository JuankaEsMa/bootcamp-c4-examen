package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Videojuego;

public interface IVideojuegoService {
	public List<Videojuego> findByNombre(String nombre);
	public Videojuego getById(Integer id);
}
