package br.com.aula7.exercicio1;

public class Imovel {
	private String endereco;
	private double preco;
	
	public String getEndereco() {
		return endereco;
	}
	public double getPreco() {
		return preco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void imprimir(){
		System.out.println("Endereco: "+ this.endereco);
		System.out.println("Preco: "+ this.preco);
	}
	
}
