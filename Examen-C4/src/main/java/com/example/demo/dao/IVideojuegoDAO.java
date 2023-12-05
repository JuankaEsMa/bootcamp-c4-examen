package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Videojuego;

public interface IVideojuegoDAO extends JpaRepository<Videojuego,Integer>{
	public List<Videojuego> findByNombre(String nombre);
}
