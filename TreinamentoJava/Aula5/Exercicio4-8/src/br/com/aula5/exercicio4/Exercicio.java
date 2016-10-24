package br.com.aula5.exercicio4;

public class Exercicio {
	public static void main(String[] args){
		Moto moto = new Moto("Yamaha", "ybr", "Branca");
		moto.marchaAcima(4);
		moto.marchaAbaixo(1);
		moto.imprimir();
	}
}
