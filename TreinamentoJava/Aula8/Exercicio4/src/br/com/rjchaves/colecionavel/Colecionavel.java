package br.com.rjchaves.colecionavel;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.rjchaves.autor.Autor;

public abstract class Colecionavel {
	private int idColecionavel;
	private String nome;
	private Calendar dataAquisicao;
	ArrayList<Autor> autores;
	
	
	
	
	public Colecionavel(int idColecionavel, String nome, Calendar dataAquisicao, ArrayList<Autor> autores) {
		super();
		this.idColecionavel = idColecionavel;
		this.nome = nome;
		this.dataAquisicao = dataAquisicao;
		this.autores = autores;
	}
	
	
	public int getIdColecionavel() {
		return idColecionavel;
	}
	public void setIdColecionavel(int idColecionavel) {
		this.idColecionavel = idColecionavel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Calendar getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(Calendar dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	
	
}
