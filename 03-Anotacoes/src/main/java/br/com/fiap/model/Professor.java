package br.com.fiap.model;

public class Professor extends Pessoa {

	@SuppressWarnings("all") //Tira o amarelinho (alertas do c�digo)
	@Override //Garantir que o m�todo est� fazendo uma sobrescrita
	//@Deprecated //O m�todo funciona mas est� obsoleto (melhor n�o utilizar)
	public void falar() {
		System.out.println("Professor falando");
		int x = 10;
	}
	
}