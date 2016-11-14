package br.com.rjchaves.colecionavel.impresso;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.rjchaves.autor.Autor;

public class Revista extends Impresso {
	private int volume;
	String principaisAssuntos;
	
	public Revista(int idColecionavel, 
			String nome, 
			Calendar dataAquisicao, 
			ArrayList<Autor> autores,
			String nomeEditora, 
			int anoPublicaco, 
			int volume,
			String principaisAssuntos) {
		super(idColecionavel, nome, dataAquisicao, autores, nomeEditora, anoPublicaco);
		
		this.volume = volume;
		this.principaisAssuntos = principaisAssuntos;
	}

	
	
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getPrincipaisAssuntos() {
		return principaisAssuntos;
	}

	public void setPrincipaisAssuntos(String principaisAssuntos) {
		this.principaisAssuntos = principaisAssuntos;
	}
	
	

}
