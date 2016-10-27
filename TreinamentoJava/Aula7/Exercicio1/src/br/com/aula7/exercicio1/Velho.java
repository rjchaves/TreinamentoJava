package br.com.aula7.exercicio1;

public class Velho extends Imovel{
	
	public double getPreco(){
		return (super.getPreco()*0.8);
	}

	public void imprimir(){
		System.out.println("Endereco: "+ this.getEndereco());
		System.out.println("Preco: "+ this.getPreco());
	}
}
