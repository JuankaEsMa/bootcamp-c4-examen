package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IUsuarioDAO;
import com.example.demo.dto.Usuario;

@Service
public class UsuarioService implements IUsuarioService{

	@Autowired
	IUsuarioDAO dao;
	@Override
	public Usuario addCliente(Usuario usuario) {
		// TODO Auto-generated method stub
		return dao.save(usuario);
	}
	@Override
	public Usuario findById(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}
	
}
