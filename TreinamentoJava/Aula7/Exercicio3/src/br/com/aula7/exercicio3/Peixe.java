package br.com.aula7.exercicio3;

public class Peixe extends Animal{
	private String caracteristica;
	Peixe(String nome, String caracteristica, int comprimento, float velocidade){
		this.alteraNome(nome);
		this.alteraCaracteristica(caracteristica);
		this.alteraComprimento(comprimento);
		this.alteraVelocidade(velocidade);
		
		this.alteraNumPatas(0);
		this.alteraCor("Cinzenta");
		this.alteraAmbiente("Mar");
	}
	void alteraCaracteristica(String caracteristica){
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
