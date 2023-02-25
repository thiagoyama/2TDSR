package br.com.fiap.view;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Teste {

	public static void main(String[] args) {
		//Instanciar uma Conta corrente
		Calendar data = new GregorianCalendar(2020, Calendar.MARCH, 10);
		ContaCorrente cc = new ContaCorrente(123, 321, data, 100, TipoConta.COMUM);

		//Instanciar uma conta poupança
		ContaPoupanca cp = new ContaPoupanca(123, 333, new GregorianCalendar(2019, Calendar.JANUARY, 2), 100, 1);

		//Realizar um saque da conta corrente
		try {
			cc.retirar(500);
			System.out.println("Saque realizado! Novo saldo: " + cc.getSaldo());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

		//Criar uma lista com 3 contas correntes
		List<ContaCorrente> lista = new ArrayList<ContaCorrente>();

		lista.add(cc);
		lista.add(new ContaCorrente(123, 321, data, 500, TipoConta.COMUM));
		lista.add(new ContaCorrente(123, 222, Calendar.getInstance(), 60, TipoConta.ESPECIAL));
		
		//Exibir o saldo das contas correntes
		for (ContaCorrente item : lista) {
			System.out.println(item);
		}
		
	}
}