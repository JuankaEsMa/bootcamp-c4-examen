package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Integer>{
	public List<Usuario> findByEmail(String email);
}
