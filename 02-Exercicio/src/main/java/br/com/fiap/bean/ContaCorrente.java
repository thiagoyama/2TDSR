package br.com.fiap.bean;

import java.util.Calendar;

public class ContaCorrente extends Conta {

	private TipoConta tipo;
	
	//Construtores (CTRL + 3 -> gcuf, gcfs)
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	@Override
	public void retirar(double valor) throws Exception {
		//Validar se a conta é comum e se o valor do saque é maior do que o saldo
		if (tipo == TipoConta.COMUM && valor > saldo) {
			//Não permite a retirada, lança uma exception
			throw new Exception("Saldo insuficiente");
		}
		saldo -= valor;
	}

	//Getters e Setters
	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}
