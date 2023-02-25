package br.com.fiap.model;

public class Professor extends Pessoa {

	@SuppressWarnings("all") //Tira o amarelinho (alertas do código)
	@Override //Garantir que o método está fazendo uma sobrescrita
	//@Deprecated //O método funciona mas está obsoleto (melhor não utilizar)
	public void falar() {
		System.out.println("Professor falando");
		int x = 10;
	}
	
}