package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.Partida;
import com.example.demo.dto.Videojuego;

@Service
public interface IPartidaService {
	public Partida getById(Integer id);
	public Partida addPartida(Partida partida);
	public List<Partida> getAllPartidas();
	public List<Partida> findByVideojuego(Videojuego videojuego);

}
