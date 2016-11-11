package br.com.meta.projetointerface.aluno;

import java.util.ArrayList;

import br.com.meta.projetointerface.excecoes.AlunoException;
import br.com.meta.projetointerface.interfaces.IControleAluno;

public class ControleAluno implements IControleAluno {
	private ArrayList<Aluno> alunos;
	
	public ControleAluno() {
		this.alunos = new ArrayList<>();
	}
	
	@Override
	public void adicionar(Aluno aluno) {
		alunos.add(aluno);
	}

	@Override
	public Aluno get(int indice) throws AlunoException {
		if(indice>= alunos.size()){
			throw new AlunoException("O aluno especificado não existe no array de alunos");
		}
		return alunos.get(indice);
	}

	@Override
	public void excluir(int indice) throws AlunoException {
		if(indice>= alunos.size()){
			throw new AlunoException("O aluno especificado não existe no array de alunos");
		}
		alunos.remove(indice);
	}

	@Override
	public ArrayList<Aluno> listagem() {
		return alunos;
	}

}
