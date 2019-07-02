package br.com.ufc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufc.model.Orientador;
import br.com.ufc.model.Usuario;
import br.com.ufc.repository.OrientadorRepository;
import br.com.ufc.repository.UsuarioRepository;

@Service
public class OrientadorService {
	@Autowired
	private OrientadorRepository orientadorRepository;

	public List<Orientador> listarOrientador() {
		return orientadorRepository.findAll();
	}
	
}
