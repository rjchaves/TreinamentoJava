package br.com.rjchaves.aula8.exercicio1.animal;

public class Peixe extends Animal{
	private String caracteristica;
	
	public Peixe(String nome, String caracteristica, float comprimento, float velocidade, String som){
		this.alteraNome(nome);
		this.alteraCaracteristica(caracteristica);
		this.alteraComprimento(comprimento);
		this.alteraVelocidade(velocidade);
		
		this.alteraNumPatas(0);
		this.alteraCor("Cinzenta");
		this.alteraAmbiente("Mar");
		this.alteraSom(som);
	}
	
	public void nadar(){
		System.out.println("Nadando " + this.getSom());
	}
	
	public void alteraCaracteristica(String caracteristica){
		this.caracteristica = caracteristica;
	}
	public String caracteristica(){ // retorna a características de um determinado peixe;
		return this.caracteristica;
	}
	
	public void dados( ){ // imprimir na tela todos os dados
		
		super.dados();
		System.out.println("Caracteristica: "+this.caracteristica);
		
	}
}
