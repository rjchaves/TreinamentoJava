package Exercicio;

public class Cedulas 
{
	private String nomeNota;
	private int valorNota;
	private int qntNotas;
	
	//---------------------------------------------------------------//
	
	public Cedulas(String nome, int valor, int quantidade)
	{
		this.nomeNota = nome;
		this.valorNota = valor;
		this.qntNotas = quantidade;
	}
	
	//---------------------------------------------------------------//
	
	public String getNomeNota() {
		return nomeNota;
	}

	public void setNomeNota(String nomeNota) {
		this.nomeNota = nomeNota;
	}

	public int getValorNota() {
		return valorNota;
	}

	public void setValorNota(int valorNota) {
		this.valorNota = valorNota;
	}
	
	public int getQntNotas() {
		return qntNotas;
	}

	public void setQntNotas(int qntNotas) {
		this.qntNotas = qntNotas;
	}
	
	//---------------------------------------------------------------//

	
}
