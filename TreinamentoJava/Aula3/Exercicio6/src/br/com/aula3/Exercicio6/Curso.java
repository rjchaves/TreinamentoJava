package br.com.aula3.Exercicio6;

public class Curso {
	private int id;
	private float numeroVagas;
	private float numCandidatosMasc;
	private float numCanditatosFem;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getNumeroVagas() {
		return numeroVagas;
	}
	public void setNumeroVagas(int numeroVagas) {
		this.numeroVagas = numeroVagas;
	}
	public float getNumCandidatosMasc() {
		return numCandidatosMasc;
	}
	public void setNumCandidatosMasc(int numCandidatosMasc) {
		this.numCandidatosMasc = numCandidatosMasc;
	}
	public float getNumCanditatosFem() {
		return numCanditatosFem;
	}
	public void setNumCanditatosFem(int numCanditatosFem) {
		this.numCanditatosFem = numCanditatosFem;
	}
	
	public float porcentagemFem(){
		return (100*this.numCanditatosFem)/this.numeroVagas;
	}
	
	public float porcentagemMasc(){
		return (100*this.numCandidatosMasc)/this.numeroVagas;
	}
	
	
}
