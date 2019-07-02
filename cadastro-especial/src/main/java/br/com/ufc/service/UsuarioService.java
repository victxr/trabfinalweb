package br.com.ufc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufc.model.Usuario;
import br.com.ufc.repository.UsuarioRepository;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void cadastrar(Usuario usuario) {

		usuarioRepository.save(usuario);
	}

	
}
