package br.com.aula7.exercicio1;

public class Novo extends Imovel{
	
	public double getPreco(){
		return (super.getPreco()*1.2);
	}

	public void imprimir(){
		System.out.println("Endereco: "+ this.getEndereco());
		System.out.println("Preco: "+ this.getPreco());
	}
}
