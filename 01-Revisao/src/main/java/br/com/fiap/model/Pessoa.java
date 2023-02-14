package br.com.fiap.model;

import java.util.Calendar;

public class Pessoa {

	//final (atributo não muda o valor, classe não herda, método não sobrescreve)
	//static -> o objeto não é necessário para utilizar o método ou atributo
	//Modificadores de acesso:
	//public -> todos
	//protected -> a classe, as classes do mesmo pacote e filhas
	//default/package -> as classes do mesmo pacote
	//private -> somente a classe
	
	//Atributos	
	private String nome;
	
	private Genero genero;
	
	//Tipos primitivos: boolean, char, byte, short, int, long, float, double 
	private int idade;
	
	//Armazenar a data de nascimento
	private Calendar dataNascimento;
	
	//Construtores : não tem retorno (nem void) e tem o mesmo nome da Classe
	//Construtor que recebe o nome do Candidato
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	//Criar um construtor que recebe o nome e idade
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getters e Setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}