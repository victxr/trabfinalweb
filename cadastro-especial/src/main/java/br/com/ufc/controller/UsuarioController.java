package br.com.ufc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ufc.model.Orientador;
import br.com.ufc.model.Usuario;
import br.com.ufc.service.OrientadorService;
import br.com.ufc.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private OrientadorService orientadorService;
	private UsuarioService usuarioService;

	@RequestMapping("/paginainicial")
	public ModelAndView paginaInicial() {
		ModelAndView mv = new ModelAndView("PaginaInicial");
		
		return mv;
	}
	
	@RequestMapping("/usuario/formulario")
	public ModelAndView form() {
		List<Orientador> orientadores = orientadorService.listarOrientador();
		ModelAndView mv = new ModelAndView("Formulario");
		mv.addObject("orientadores", orientadores);
		mv.addObject("usuario", new Usuario());
		return mv;
	}
	
	@RequestMapping("/usuario/salvar")
	public ModelAndView salvar(Usuario usuario) {
		

		usuarioService.cadastrar(usuario);
		ModelAndView mv = new ModelAndView("redirect:/paginainicial");
		
		return mv;
	}
	
	
	
}
