package com.example.demo.service;

import com.example.demo.dto.Usuario;

public interface IUsuarioService {
	public Usuario addCliente(Usuario usuario);
	public Usuario findById(Integer id);
}
