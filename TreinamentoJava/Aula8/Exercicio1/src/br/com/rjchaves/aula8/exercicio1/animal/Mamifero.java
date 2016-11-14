package br.com.rjchaves.aula8.exercicio1.animal;

public class Mamifero extends Animal{
	private String alimento;
	
	public Mamifero (String nome, String cor, String alimento,float comprimento, float velocidade, int patas, String som){
		this.alteraNome(nome);
		this.alteraCor(cor);
		this.alteraAlimento(alimento);
		this.alteraComprimento(comprimento);
		this.alteraVelocidade(velocidade);
		this.alteraNumPatas(patas);
		this.alteraAmbiente("Terra");
		this.alteraSom(som);
	}
	
	public void correr(){
		System.out.println("Correndo "+ this.getSom());
	}
	
	void alteraAlimento(String caracteristica){
		this.alimento = caracteristica;
	}
	public String alimento(){ // retorna a características de um determinado peixe;
		return this.alimento;
	}
	
	public void dados( ){ // imprimir na tela todos os dados
		super.dados();
		System.out.println("Alimento: "+this.alimento);
	}
}
