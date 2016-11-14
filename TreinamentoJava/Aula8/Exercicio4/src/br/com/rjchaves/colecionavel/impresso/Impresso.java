package br.com.rjchaves.colecionavel.impresso;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.rjchaves.autor.Autor;
import br.com.rjchaves.colecionavel.Colecionavel;

public abstract class Impresso extends Colecionavel {
	
	
	private String nomeEditora;
	private int anoPublicacao;
	
	public Impresso(int idColecionavel, 
			String nome, 
			Calendar dataAquisicao, 
			ArrayList<Autor> autores,
			String nomeEditora,
			int anoPublicaco) {
		super(idColecionavel, nome, dataAquisicao, autores);
		
		this.nomeEditora = nomeEditora;
		this.anoPublicacao = anoPublicaco;
	}
	
	public String getNomeEditora() {
		return nomeEditora;
	}
	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	
}
