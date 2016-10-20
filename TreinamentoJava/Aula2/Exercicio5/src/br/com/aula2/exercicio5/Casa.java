package br.com.aula2.exercicio5;

import java.util.ArrayList;

public class Casa {
	private String cor;
	private ArrayList<Porta> portas;

	public Casa(String cor, ArrayList<Porta> portas) {
		this.cor = cor;
		this.portas = portas;
	}

	public void pinta(String s) {
		this.cor = s;
	}
	
	public String getCor(){
		return cor;
	}

	public int quantasPortasEstaoAbertas() {
		int portasAbertas = 0;
		for(Porta p: portas){
			if(p.estaAberta())
				portasAbertas++;
		}

		return portasAbertas;
	}

	public int totalDePortasFechadas() {
		int portasFechadas = 0;
		for(Porta p: portas){
			if(!p.estaAberta())
				portasFechadas++;
		}
		return portasFechadas;
	}
	
}
