package br.com.rjchaves.aula8.exercicio1.animal;

public class Anfibio extends Animal{
	private String alimento;
	
	public Anfibio (String nome ,float comprimento, float velocidade, int patas, String som){
		this.alteraNome(nome);
		this.alteraCor("verde");
		this.alteraAlimento("Pequenos animais");
		this.alteraComprimento(comprimento);
		this.alteraVelocidade(velocidade);
		this.alteraNumPatas(patas);
		this.alteraAmbiente("Agua");
		this.alteraSom(som);
	}
	
	public void Nadar(){
		System.out.println("Nadando "+ this.getSom());
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
