package br.com.ufc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orientador {
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Id
	private int id;
	private String nome;
	


}
