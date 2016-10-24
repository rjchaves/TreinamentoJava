package br.com.aula3.Exercicio5;

import java.util.ArrayList;

public class Pesquisa {
	private ArrayList<Pessoa> pessoas;

	public Pesquisa(ArrayList<Pessoa> pessoas) {

		this.pessoas = pessoas;
	}
	
	public void processa(){
		float totalSim = 0;
		float totalFem = 0;
		float totalMasc = 0;
		float totalSimFem = 0;
		float totalNaoMasc = 0;
		
		for(Pessoa p:pessoas){
			if(p.getResposta()=='s' || p.getResposta()=='S'){
				totalSim++;
			}
			
			if(p.getSexo()=='m' || p.getSexo()=='M'){
				totalMasc++;
				if(p.getResposta()=='n' || p.getResposta()=='N'){
					totalNaoMasc++;
				}
			}else{
				totalFem++;
				if(p.getResposta()=='s' || p.getResposta()=='S'){
					totalSimFem++;
				}
			}
		}
		
		System.out.println(totalSim+" responderam Sim");
		System.out.println((20-totalSim)+" responderam Não");
		if(totalFem==0){
			System.out.println("0% Das mulheres respondeu Sim");
		}else{
			System.out.println((100*totalSimFem)/totalFem+"% Das mulheres respondeu Sim");
		}
		
		if(totalMasc==0){
			System.out.println("0% Dos homens respondeu Não");
		}else{
			System.out.println((100*totalNaoMasc)/totalMasc+"% Dos homens respondeu Não");
		}
	}
}
