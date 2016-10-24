package br.com.aula3.Exercicio6;

import java.util.ArrayList;

public class Cursos {
	private ArrayList<Curso> cursos;
	
	public Cursos(){
		this.cursos= new ArrayList<>();
	}
	
	public Cursos(ArrayList<Curso> cursos){
		this.cursos=cursos;
	}
	
	public void addCurso(Curso curso){
		this.cursos.add(curso);
	}
	
	private float calculaPorcentagemMulheres(Curso c){
		float porcentagemMulheres; 
		if(c.getNumCanditatosFem()>0){
			porcentagemMulheres=(100*c.getNumCanditatosFem())/c.getNumeroVagas();	
		}else{
			porcentagemMulheres = 0;
		}
		return porcentagemMulheres;
	}
	
	private float calculaCandidatoVaga(Curso c){
		return (c.getNumCandidatosMasc()+c.getNumCanditatosFem())/c.getNumeroVagas();
	}
	
	public void printCursos(){
		int indice=0;
		int indiceMaiorCandidatoVaga=0;
		for(Curso c: cursos){
			if(calculaCandidatoVaga(c) > calculaCandidatoVaga(cursos.get(indiceMaiorCandidatoVaga))){
				indiceMaiorCandidatoVaga=indice;
			}
			System.out.println("Curso: " + c.getId() + "\tNumero de candidatos por vaga: " + this.calculaCandidatoVaga(c));
			indice++;
		}
		System.out.println("Maior valor de candidato/vaga");
		System.out.println("Curso :" + cursos.get(indiceMaiorCandidatoVaga).getId());
		System.out.println("Relação candidato/vaga :" + calculaCandidatoVaga(cursos.get(indiceMaiorCandidatoVaga)));
	}
	
}
