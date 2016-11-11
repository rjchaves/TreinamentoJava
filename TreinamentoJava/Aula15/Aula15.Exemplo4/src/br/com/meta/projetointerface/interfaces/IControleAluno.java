package br.com.meta.projetointerface.interfaces;

import java.util.ArrayList;

import br.com.meta.projetointerface.aluno.Aluno;
import br.com.meta.projetointerface.excecoes.AlunoException;

public interface IControleAluno {
	void adicionar(Aluno aluno);
	Aluno get(int indice) throws AlunoException;
	void excluir(int indice) throws AlunoException;
	ArrayList<Aluno> listagem();
}
