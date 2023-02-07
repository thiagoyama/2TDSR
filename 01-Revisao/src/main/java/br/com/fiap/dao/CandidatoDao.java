package br.com.fiap.dao;

import java.util.List;
import br.com.fiap.model.Candidato;

//Contrato, define as assinaturas dos métodos
public interface CandidatoDao {

	void cadastrar(Candidato candidato);
	
	List<Candidato> listar();
	
}