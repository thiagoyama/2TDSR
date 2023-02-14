package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fiap.model.Candidato;
import br.com.fiap.model.Genero;

public class TesteCandidato {

	//Criar um m�todo main
	//Instanciar um candidato com o nome "Nome" e as Skills "Comunica��o", "Raciocinio Logico", "Trabalho em equipe"
	public static void main(String[] args) {
		
		//Criar uma lista de String
		List<String> skills = new ArrayList<String>();
		//Adicionar as skills na lista
		skills.add("Comunica��o");
		skills.add("Racionc�nio L�gico");
		skills.add("Trabalho em Equipe");
		
		//Instanciar o candidado com o nome e a lista de skills
		Candidato c = new Candidato("Hitoshi", skills);
		
		//Exibir os valores dos atributos...
		System.out.println("Nome do candidato: " + c.getNome());
		System.out.println("Skills:");
		//La�o de repeti��o
		for (int i=0; i < c.getSkills().size() ; i ++) {
			System.out.println(c.getSkills().get(i));
		}
		
		//Instanciando um Candidato, definindo o nome e criando uma lista a partir de um vetor de String
		Candidato c2 = new Candidato("Almeida", 
				Arrays.asList(new String[] {"Comunica��o", "Racioc�nio L�gico", "Trabalho em Equipe"}));
		
		//Foreach para exibir as skills do candidato 2
		for (String s : c2.getSkills()) {
			System.out.println(s);
		}
		
		//Definir o genero do candidato
		c2.setGenero(Genero.FEMININO);
		
		//Validar se o candidato é mulher
		if (c2.getGenero() == Genero.FEMININO) {
			System.out.println("É do genero feminino");
		}
		
		//Exibir o genero do candidato
		System.out.println(c2.getGenero());
	}
}