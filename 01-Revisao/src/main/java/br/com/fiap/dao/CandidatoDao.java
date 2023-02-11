package br.com.fiap.dao;

import java.util.List;
import br.com.fiap.model.Pessoa;

//Contrato, define as assinaturas dos métodos
public interface CandidatoDao {

	void cadastrar(Pessoa pessoa);
	
	List<Pessoa> listar();
	
}