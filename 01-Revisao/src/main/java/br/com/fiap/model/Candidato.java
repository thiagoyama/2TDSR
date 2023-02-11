package br.com.fiap.model;

import java.util.List;

public class Candidato extends Pessoa {

	private List<String> skills;
	
	private String escolaridade;
	
	private boolean deficiente;
	
	//Construtor que recebe o nome e skills
	public Candidato(String nome, List<String> skills) {
		super(nome);
		this.skills = skills;
	}
	
	public Candidato(String nome) {
		super(nome);
	}

	//Getters e Setters
	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public boolean isDeficiente() {
		return deficiente;
	}

	public void setDeficiente(boolean deficiente) {
		this.deficiente = deficiente;
	}
	
}