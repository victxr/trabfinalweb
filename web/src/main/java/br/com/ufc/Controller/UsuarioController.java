package br.com.ufc.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.ufc.model.Usuario;
import br.com.ufc.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping
	@RequestMapping("/usuario/salvar")
	public ModelAndView salvar(Usuario usuario){
		usuarioService.cadastrar(usuario);
		
		return new ModelAndView("redirect:/paginainicial");
	}
	
	@RequestMapping("/paginainicial")
	public ModelAndView paginaInicial() {
		ModelAndView mv = new ModelAndView("PaginaInicial");
		return mv;
	}
	
	@RequestMapping("/usuario/logar")
	public ModelAndView logar() {
		
		ModelAndView mv = new ModelAndView("Login");
		
		return mv;
	}
	
	
}
