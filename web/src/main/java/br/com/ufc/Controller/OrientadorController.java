package br.com.ufc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import br.com.ufc.model.Orientador;
import br.com.ufc.service.OrientadorService;

@RestController
public class OrientadorController {
	
	@Autowired
	private OrientadorService orientadorService;
	
		@RequestMapping("/usuario/cadastrar")
	public ModelAndView cadastrar() {
		ModelAndView mv = new ModelAndView("Cadastro");
		List<Orientador> orientadores = orientadorService.listarOrientador();
		
		if(!orientadores.isEmpty()) {
			mv.addObject("orientadores", orientadores);
			
		}
		
		return mv;
	}
	
	
}
