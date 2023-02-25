package br.com.fiap.view;

import java.lang.reflect.Field;

import br.com.fiap.anotation.Coluna;
import br.com.fiap.model.Pessoa;

public class Teste {

	public static void main(String[] args) {

		//Instanciar uma Pessoa
		Pessoa pessoa = new Pessoa();
		
		//Através da API de Reflection, recuperar o nome da classe
		String nomeClasse = pessoa.getClass().getName();
		System.out.println(nomeClasse);
		
		System.out.println("Atributos");
		//Recuperar os atributos da classe Pessoa
		Field[] atributos = pessoa.getClass().getDeclaredFields();
		//Percorrer os atributos e exibir o nome e tipo
		for (Field att : atributos) {
			System.out.println(att.getName() + " " + att.getType());
			//Recuperar a anotação @Coluna
			Coluna anotacao = att.getAnnotation(Coluna.class);
			System.out.println(anotacao.nome() + " " + anotacao.tamanho() + " " + anotacao.obrigatorio());
		}
		
	}
}