package br.com.fiap.bean;

import java.util.Calendar;

public class ContaPoupanca extends Conta implements ContaInvestimento {

	private float taxa;
	
	//Constante no Java
	private final static float RENDIMENTO = 0.05f;
	
	//Construtores: Padrão e o com todos
	public ContaPoupanca() {}
	
	public ContaPoupanca(int agencia, int numero, Calendar dataAbertura, double saldo, float taxa) {
		super(agencia, numero, dataAbertura, saldo);
		this.taxa = taxa;
	}

	//CTRL + D -> apaga a linha
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
	}
	
	//Valida se o saldo é suficiente, junto com a taxa de retirada (R$)
	@Override
	public void retirar(double valor) throws Exception {
		if (saldo < valor + taxa) {
			throw new Exception("Saldo insuficiente");
		}
		saldo -= valor + taxa;
	}

	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

}
