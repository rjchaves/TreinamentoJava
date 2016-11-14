package br.com.rjchaves.colecionavel.midia;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.rjchaves.autor.Autor;
import br.com.rjchaves.colecionavel.Colecionavel;

public class CompactDisc extends Colecionavel{
	private String genero;
	private ArrayList<String> nomeFaixasMusica;
	
	public CompactDisc(int idColecionavel, 
			String nome, 
			Calendar dataAquisicao, 
			ArrayList<Autor> autores,
			String genero,
			ArrayList<String> nomeFaixasMusica) {
		super(idColecionavel, nome, dataAquisicao, autores);
		
		
		this.genero = genero;
		this.nomeFaixasMusica = nomeFaixasMusica;
	}
	

	public String getGenero() {
		return genero;
	}

	public ArrayList<String> getNomeFaixasMusica() {
		return nomeFaixasMusica;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setNomeFaixasMusica(ArrayList<String> nomeFaixasMusica) {
		this.nomeFaixasMusica = nomeFaixasMusica;
	}
	
	
}
