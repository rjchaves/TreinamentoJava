package br.com.aula2.exercicio4;

public class Exercicio4 {
	public static void main(String[] args){
		Estoque estoque1 = new Estoque("Impressora Jato de Tinta",
										13,
										16);
		
		Estoque estoque2 = new Estoque("Monitor LCD 17 polegadas",
										11,
										13);
		
		Estoque estoque3 = new Estoque("Mouse",
										6,
										2);
		
		
		estoque1.darBaixa(5);
		estoque2.repor(7);
		estoque3.darBaixa(4);
		
		System.out.println(estoque1.precisaRepor());
		System.out.println(estoque2.precisaRepor());
		System.out.println(estoque3.precisaRepor());
		
		System.out.println(estoque1.mostra());
		System.out.println(estoque2.mostra());
		System.out.println(estoque3.mostra());
		
		
		
	}
}
