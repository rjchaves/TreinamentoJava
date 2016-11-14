package br.com.rjchaves.colecionavel.midia;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.rjchaves.autor.Autor;
import br.com.rjchaves.colecionavel.Colecionavel;

public class DVD  extends Colecionavel {
	private ETipoDVD tipoDvd;
	private String descricao; 
	
	public DVD(int idColecionavel, 
			String nome, 
			Calendar dataAquisicao, 
			ArrayList<Autor> autores, 
			ETipoDVD tipoDVD, 
			String descricao) {
		super(idColecionavel, nome, dataAquisicao, autores);
		
		this.tipoDvd = tipoDVD;
		this.descricao = descricao;
	}

	public ETipoDVD getTipoDvd() {
		return tipoDvd;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setTipoDvd(ETipoDVD tipoDvd) {
		this.tipoDvd = tipoDvd;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
