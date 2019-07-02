package br.com.ufc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ufc.model.Orientador;

@Repository
public interface OrientadorRepository extends JpaRepository<Orientador, Long>{

}
