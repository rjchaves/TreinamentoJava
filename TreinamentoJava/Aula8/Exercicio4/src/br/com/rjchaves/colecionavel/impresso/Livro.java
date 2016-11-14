package br.com.rjchaves.colecionavel.impresso;

import java.util.ArrayList;
import java.util.Calendar;

import br.com.rjchaves.autor.Autor;

public class Livro extends Impresso{

	public Livro(int idColecionavel, 
			String nome, 
			Calendar dataAquisicao, 
			ArrayList<Autor> autores, 
			String nomeEditora,
			int anoPublicaco) {
		super(idColecionavel, nome, dataAquisicao, autores, nomeEditora, anoPublicaco);
		// TODO Auto-generated constructor stub
	}
	
	
}
