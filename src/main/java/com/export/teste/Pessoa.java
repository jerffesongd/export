package com.export.teste;

import com.export.domain.CampoRelatorio;
import com.export.domain.Relatorio;

public class Pessoa implements Relatorio {
	
	String nome;
	int idade;
	Double altura;
	
	public Pessoa() {
		super();
		
	}
	
	public Pessoa(String nome) {
		super();
		this.nome = nome;
		
	}
	
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(String nome, Double altura) {
		super();
		this.nome = nome;
		this.altura = altura;
	}
	
	public Pessoa(String nome, int idade , Double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	@CampoRelatorio
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@CampoRelatorio
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	@CampoRelatorio
	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	
	
	
	
}
