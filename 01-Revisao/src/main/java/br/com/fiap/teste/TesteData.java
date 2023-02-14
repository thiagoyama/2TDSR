package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteData {

	public static void main(String[] args) {
		//Criar um objeto de Calendar com a data atual
		Calendar hoje = Calendar.getInstance();

		//Criar um objeto de Calendar com uma data específica (ano, mes, dia)  
		Calendar natal = new GregorianCalendar(2023, Calendar.DECEMBER, 25);
		
		//Criar um objeto para formatar a data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Exibir a data atual formatada
		System.out.println(formatador.format(hoje.getTime()));
		
		//Exibir a data específica formatada
		System.out.println(formatador.format(natal.getTime()));
		
	}
}