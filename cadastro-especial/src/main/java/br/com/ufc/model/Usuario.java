package br.com.ufc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	public String getBolsa() {
		return bolsa;
	}
	public void setBolsa(String bolsa) {
		this.bolsa = bolsa;
	}
	public Integer getIdOrientador() {
		return idOrientador;
	}
	public void setIdOrientador(Integer idOrientador) {
		this.idOrientador = idOrientador;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
public Usuario() {
	// TODO Auto-generated constructor stub
}

	public Usuario(String nome, Integer matricula, String nascimento, String bolsa, Integer idOrientador, String senha) {
	
	this.nome = nome;
	this.matricula = matricula;
	this.nascimento = nascimento;
	this.bolsa = bolsa;
	this.idOrientador = idOrientador;
	this.senha = senha;
}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	private String nome;
	private Integer matricula;
	private String nascimento;
	private String bolsa;
	private Integer idOrientador;
	private String senha;
	
	
}
