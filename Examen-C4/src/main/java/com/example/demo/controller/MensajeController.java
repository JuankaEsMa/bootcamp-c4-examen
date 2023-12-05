package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Mensaje;
import com.example.demo.dto.Partida;
import com.example.demo.dto.Usuario;
import com.example.demo.service.MensajeService;
import com.example.demo.service.PartidaService;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("mensaje")
public class MensajeController {
	@Autowired
	MensajeService mensajeService;
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	PartidaService partidaService;
	@GetMapping("/partida/{idPartida}")
	public List<Mensaje> getMensajesPartida(@PathVariable Integer idPartida){
		Partida partida = partidaService.getById(idPartida);
		return mensajeService.findByPartida(partida);
	}
	@GetMapping("/usuario/{idUsuario}")
	public Mensaje getMensajesUsuario(@PathVariable Integer idUsuario){
		Usuario usuario = usuarioService.findById(idUsuario);
		return mensajeService.findByUsuario(usuario);
	}
	@PutMapping("/{id}")
	public Mensaje updateMensaje(@RequestBody Mensaje mensaje, @PathVariable Integer id) {
		Mensaje mensajeActualizar = mensajeService.getById(id);
		return mensajeService.saveMensaje(null);
	}
	@PostMapping("/{id_usuario}/{id_partida}")
	public Mensaje addMensaje(@PathVariable Integer idUsuario, @PathVariable Integer idPartida, @RequestBody Mensaje mensaje) {
		mensaje.setPartida(partidaService.getById(idPartida));
		mensaje.setAutor(usuarioService.findById(idUsuario));
		return mensajeService.saveMensaje(mensaje);
	}
}
