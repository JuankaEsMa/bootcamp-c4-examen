package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Mensaje;
import com.example.demo.dto.Partida;
import com.example.demo.dto.Usuario;

public interface IMensajeService {
	public List<Mensaje> findByPartida(Partida partida);
	public Mensaje findByUsuario(Usuario usuario);
	public Mensaje getById(Integer id);
}
