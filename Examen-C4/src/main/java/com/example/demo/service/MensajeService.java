package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMensajeDAO;
import com.example.demo.dto.Mensaje;
import com.example.demo.dto.Partida;
import com.example.demo.dto.Usuario;

@Service
public class MensajeService implements IMensajeService{

	@Autowired
	IMensajeDAO dao;
	
	@Override
	public List<Mensaje> findByPartida(Partida partida) {
		// TODO Auto-generated method stub
		return dao.findByPartida(partida);
	}

	@Override
	public Mensaje findByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return dao.findByAutor(usuario);
	}
	
	public Mensaje saveMensaje(Mensaje mensaje) {
		return dao.save(mensaje);
	}

	@Override
	public Mensaje getById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}
	
}
