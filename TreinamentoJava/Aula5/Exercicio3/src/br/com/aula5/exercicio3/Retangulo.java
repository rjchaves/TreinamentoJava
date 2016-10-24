package br.com.aula5.exercicio3;

public class Retangulo {
	private float comprimento;
	private float largura;
	private float area;
	private float perimetro;
	
	public Retangulo(float comprimento, float largura) {
	
		this.comprimento = comprimento;
		this.largura = largura;
		this.calcularTudo();
	}

	private void calcularArea(){
		this.area =  comprimento*largura;
	}
	
	private void calcularPerimetro(){
		this.perimetro=comprimento*2+largura*2;
	}
	
	private void calcularTudo(){
		this.calcularArea();
		this.calcularPerimetro();
	}
	
	public void imprimir(){
		System.out.println("Comprimento: "+this.comprimento);
		System.out.println("Largura: "+this.largura);
		System.out.println("Área: "+this.area);
		System.out.println("Perímetro: "+this.perimetro);
	}
	
}
