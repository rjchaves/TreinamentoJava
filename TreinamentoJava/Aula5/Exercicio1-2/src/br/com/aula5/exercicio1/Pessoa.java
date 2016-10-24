package br.com.aula5.exercicio1;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	
	
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}



	public void imprimir(){
		System.out.println("Nome: "+ nome);
		System.out.println("Endereco: "+ endereco);
		System.out.println("Telefone "+ telefone);
	}
}
