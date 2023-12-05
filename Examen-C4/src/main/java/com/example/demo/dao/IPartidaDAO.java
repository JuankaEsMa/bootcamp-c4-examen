package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Partida;
import com.example.demo.dto.Videojuego;

public interface IPartidaDAO extends JpaRepository<Partida,Integer>{
	List<Partida> findByVideojuego(Videojuego videojuego);
}
