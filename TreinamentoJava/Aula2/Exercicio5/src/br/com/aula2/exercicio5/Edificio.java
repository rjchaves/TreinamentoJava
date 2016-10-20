package br.com.aula2.exercicio5;

import java.util.ArrayList;

public class Edificio {
	private String cor;
	private int totalDePortas; 
	private int totalDeAndares;
	private ArrayList<Porta> portas;
	
	public Edificio(String cor, int andares){
		this.cor = cor;
		portas =  new ArrayList<>();
		this.totalDeAndares=andares;
	}
	
	public void pinta(String s){
		this.cor = s;
	}
	
	public String getCor(){
		return cor;
	}
	
	public int quantasPortasEstaoAbertas(){
		int totalAbertas = 0;
		for(Porta p : portas){
			if(p.estaAberta())
				totalAbertas++;
		}
		return totalAbertas;
	}
	
	public void adicionaPorta(Porta p){
		portas.add(p);
		totalDePortas++;
	}
	
	
	public int totalDePortas(){
		return totalDePortas;
	}
	
	public void adicionarAndar(){
		totalDeAndares++;
	}
	public int totalDeAndares(){
		return this.totalDeAndares;
	}
}
