package br.com.fiap.teste;

import java.util.HashMap;
import java.util.Map;

public class Teste {
	
	public static void main(String[] args) {
		//Chave, Valor
		Map<String, Integer> mapa = new HashMap<String, Integer>();
		
		mapa.put("Acre", 12313133);
		
		System.out.println(mapa.get("Acre"));
	}
}