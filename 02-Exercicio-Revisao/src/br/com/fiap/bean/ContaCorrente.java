package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoInsuficienteException;

//CTRL + 1 -> Solução rápida
public class ContaCorrente extends Conta {
	
	private TipoConta tipo;

	//CTRL + D -> apaga a linha

//	@Override
//	public void depositar(double valor) {
//		saldo += valor;
//	}

	@Override
	public void retirar(double valor) throws SaldoInsuficienteException {
		if (tipo == TipoConta.COMUM && saldo - valor < 0) {
			throw new SaldoInsuficienteException(saldo);
		} 
		saldo -= valor;
	}
	
	// CTRL + 3 -> gcuf
	public ContaCorrente() {}
	
	public ContaCorrente(int agencia, int numero, Calendar dataAbertura, double saldo, TipoConta tipo) {
		super(agencia, numero, dataAbertura, saldo);
		this.tipo = tipo;
	}

	public TipoConta getTipo() {
		return tipo;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}

}