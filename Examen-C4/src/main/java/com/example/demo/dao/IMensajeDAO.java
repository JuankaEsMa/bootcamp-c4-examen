package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Mensaje;
import com.example.demo.dto.Partida;
import com.example.demo.dto.Usuario;

public interface IMensajeDAO extends JpaRepository<Mensaje, Integer>{
	public List<Mensaje> findByPartida(Partida partida);
	public Mensaje findByAutor(Usuario usuario);
}
