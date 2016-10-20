package br.com.aula2.Exercicio3;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado){
		this.lado = lado;
	}
	
	public double area(){
		return lado*lado;
	}
	
	public double perimetro(){
		return 4*lado;
	}
}
