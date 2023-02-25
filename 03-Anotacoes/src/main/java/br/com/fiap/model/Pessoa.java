package br.com.fiap.model;

import br.com.fiap.anotation.Coluna;

public class Pessoa {
	
	@Coluna(nome = "nm_pessoa", tamanho = 50, obrigatorio = true)
	private String nome;
	
	@Coluna(nome = "nr_idade", obrigatorio = true)
	private int idade;

	public void falar() {
		System.out.println("Pessoa falando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}