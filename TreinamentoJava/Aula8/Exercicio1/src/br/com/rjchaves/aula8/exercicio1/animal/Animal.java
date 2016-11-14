package br.com.rjchaves.aula8.exercicio1.animal;

public class Animal {
	private String nome;
	private String cor;
	private String ambiente;
	private float comprimento;
	private float velocidade;
	private int patas;
	private String som;
	
	public Animal() {
		this.alteraNumPatas(4);
	}
	
	public Animal(String nome, String cor, String ambiente, float comprimento, float velocidade, String som, int numPatas) {
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.patas = numPatas;
		this.som = som;
	}
	public Animal(String nome, String cor, String ambiente, float comprimento, float velocidade, String som) {
		this();
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
		this.som = som;
	}
	
	public void alteraSom(String som){
		this.som = som;
	}
	
	public String getSom(){
		return som;
	}

	public void alteraNome(String nome) {
		this.nome = nome;
	}

	public void alteraCor(String cor) {
		this.cor = cor;
	}

	public void alteraAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public void alteraComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public void alteraVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public void alteraNumPatas(int numPatas) {
		this.patas = numPatas;
	}
	
	public void dados(){
		
		System.out.println("Animal: "+ this.nome);
		System.out.println("Comprimento: "+ this.comprimento + " cm");
		System.out.println("Patas: "+ this.patas);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Ambiente: "+ this.ambiente);
		System.out.println("Velocidade: "+ this.velocidade + " m/s");
		System.out.println(this.som);
		
	}
	
}
