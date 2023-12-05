package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPartidaDAO;
import com.example.demo.dto.Partida;
import com.example.demo.dto.Videojuego;

@Service
public class PartidaService implements IPartidaService{

	@Autowired
	IPartidaDAO dao;
	
	@Override
	public Partida addPartida(Partida partida) {
		return dao.save(partida);
	}

	@Override
	public List<Partida> getAllPartidas() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Partida> findByVideojuego(Videojuego videojuego) {
		// TODO Auto-generated method stub
		return dao.findByVideojuego(videojuego);
	}

	@Override
	public Partida getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

}
