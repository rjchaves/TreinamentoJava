package br.com.aula2.exercicio1;

public class Pessoa {
	private String nome;
	private int idade;
	
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void fazAniversario(){
		this.idade++;
	}
	
	String retornaNomeIdade(){
		return this.nome +" "+ this.idade + " anos";
	}
}
