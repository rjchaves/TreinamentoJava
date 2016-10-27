package br.com.aula7.exercicio3;

public class Mamifero extends Animal{
	private String alimento;
	
	public Mamifero (String nome, String cor, String alimento,int comprimento, float velocidade, int patas){
		this.alteraNome(nome);
		this.alteraCor(cor);
		this.alteraAlimento(alimento);
		this.alteraComprimento(comprimento);
		this.alteraVelocidade(velocidade);
		this.alteraNumPatas(patas);
		this.alteraAmbiente("Terra");
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
