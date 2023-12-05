package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IVideojuegoDAO;
import com.example.demo.dto.Videojuego;

@Service
public class VideojuegoService implements IVideojuegoService{

	@Autowired
	IVideojuegoDAO dao;
	
	@Override
	public List<Videojuego> findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return dao.findByNombre(nombre);
	}

	@Override
	public Videojuego getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

}
