package br.com.aula5.exercicio4;

public class Moto {
	private String marca; 
	private String modelo; 
	private String cor; 
	private int marcha;
	
	public Moto() {
	}
	
	public Moto(String marca, String modelo, String cor) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = 0;
	}
	
	public void marchaAcima(int num){
		if((this.marcha+num)<=this.maiorMarcha()){
			this.marcha+=num;
		}
	}
	public void marchaAbaixo(int num){
		if((this.marcha-num)>=this.menorMarcha()){
			this.marcha-=num;
		}
	}
	
	private int menorMarcha(){
		return 0;
	}
	
	private int maiorMarcha(){
		return 5;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void imprimir(){
		System.out.println("Marca: "+this.marca);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.cor);
		System.out.println("Marcha: "+this.marcha);
	}
	
	
}
