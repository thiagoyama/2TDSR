package br.com.fiap.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.fiap.model.Candidato;

public class TesteCandidato {

	//Criar um método main
	//Instanciar um candidato com o nome "Nome" e as Skills "Comunicação", "Raciocinio Logico", "Trabalho em equipe"
	public static void main(String[] args) {
		
		//Criar uma lista de String
		List<String> skills = new ArrayList<String>();
		//Adicionar as skills na lista
		skills.add("Comunicação");
		skills.add("Racioncínio Lógico");
		skills.add("Trabalho em Equipe");
		
		//Instanciar o candidado com o nome e a lista de skills
		Candidato c = new Candidato("Hitoshi", skills);
		
		//Exibir os valores dos atributos...
		System.out.println("Nome do candidato: " + c.getNome());
		System.out.println("Skills:");
		//Laço de repetição
		for (int i=0; i < c.getSkills().size() ; i ++) {
			System.out.println(c.getSkills().get(i));
		}
		
		//Instanciando um Candidato, definindo o nome e criando uma lista a partir de um vetor de String
		Candidato c2 = new Candidato("Almeida", 
				Arrays.asList(new String[] {"Comunicação", "Raciocínio Lógico", "Trabalho em Equipe"}));
		
		//Foreach para exibir as skills do candidato 2
		for (String s : c2.getSkills()) {
			System.out.println(s);
		}
		
	}
}