package br.com.aula6;

public class Caixa {
	private Montante montante;
	
	public Caixa(){
		this.montante = new Montante();
	}
	
	public int pegarTotalDisponivel(){
		return montante.getTotalMontante();
	}
	
	public void adicionarMontante(Montante montante){
		this.montante.somaMontante(montante);
	}
	
	
	public Montante getMontante(){
		return montante.copiarMontante();
	}
	
	public Montante sacar(int valor){
		return this.montante.retiraMontante(valor);
	}
}
