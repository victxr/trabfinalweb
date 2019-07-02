package br.com.ufc.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ufc.model.Usuario;
import br.com.ufc.repository.UsuarioRepository;


@Repository
@Transactional
public class UserDetailsServiceImplementacao implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Usuario usuario = usuarioRepository.findByMatricula(username);
		
		if(usuario == null) {
			throw new UsernameNotFoundException("Aluno não encontrado");
		}
		
		
		return new User(usuario.getUsername(), usuario.getPassword(),true, true, true, true,
				usuario.getAuthorities());
		
	}

}
