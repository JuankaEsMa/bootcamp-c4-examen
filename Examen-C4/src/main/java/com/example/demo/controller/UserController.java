package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UserController {
	@Autowired
	UsuarioService service;
	@PostMapping("registrarse")
	public Usuario añadirUsuario(@RequestBody Usuario usuario) {
		return service.addCliente(usuario);
	}
	@PostMapping("entrar/{IdUsuario}/{IdPartida}")
	public String unirsePartida(@PathVariable Integer idUsuario, @PathVariable Integer idPartida) {
		return "Unido con éxito";
	}
	@PostMapping("{idUsuario}/partida/exit")
	public Usuario salirsePartida(@PathVariable Integer idUsuario){
		Usuario usuario = service.findById(idUsuario);
		usuario.setPartida(null);
		return service.addCliente(usuario);
	}
	@PutMapping("{idUsuario}")
	public Usuario updateUser(@PathVariable Integer idUsuario, @RequestBody Usuario usuario) {
		Usuario usuarioActualizar = service.findById(idUsuario);
		usuarioActualizar.setApellido(usuario.getApellido());
		usuarioActualizar.setNombre(usuario.getNombre());
		usuarioActualizar.setUsuarioSteam(usuario.getUsuarioSteam());

		return service.addCliente(usuario);
	}
}
