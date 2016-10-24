package br.com.aula3.Exercicio3;

public class Mercadoria {
	private String nome;
	private float precoCompra;
	private float precoVenda;
	
	public Mercadoria(){
		this.nome = "";
		this.precoCompra=0;
		this.precoVenda=0;
	}
	
	public float lucro(){
		return ((precoVenda-precoCompra)/precoVenda)*100;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(float precoCompra) {
		this.precoCompra = precoCompra;
	}

	public float getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(float precoVenda) {
		this.precoVenda = precoVenda;
	}
}
