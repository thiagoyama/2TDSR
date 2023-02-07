package br.com.fiap.model;

public class Candidato {

	//final (atributo não muda o valor, classe não herda, método não sobrescreve)
	//static -> o objeto não é necessário para utilizar o método ou atributo
	//Modificadores de acesso:
	//public -> todos
	//protected -> a classe, as classes do mesmo pacote e filhas
	//default/package -> as classes do mesmo pacote
	//private -> somente a classe
	
	//Atributos
	private String nome;
	//Tipos primitivos: boolean, char, byte, short, int, long, float, double 
	private int idade;
	
	//Construtores : não tem retorno (nem void) e tem o mesmo nome da Classe
	//Construtor que recebe o nome do Candidato
	public Candidato(String nome) {
		this.nome = nome;
	}
	
	//Criar um construtor que recebe o nome e idade
	public Candidato(String nome, int idade) {
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
	
}