package br.com.meta.projetointerface;

import java.util.ArrayList;

import br.com.meta.projetointerface.aluno.Aluno;
import br.com.meta.projetointerface.aluno.ControleAluno;
import br.com.meta.projetointerface.excecoes.AlunoException;
import br.com.meta.projetointerface.excecoes.FuncionarioException;
import br.com.meta.projetointerface.interfaces.IControleAluno;
import br.com.meta.projetointerface.interfaces.IFaxineira;
import br.com.meta.projetointerface.interfaces.IJardineiro;
import br.com.meta.projetointerface.interfaces.IProfessor;

public class Universidade {

	private IFaxineira faxineira;
	private IJardineiro jardineiro;
	private ArrayList<IProfessor> professores;
	private String nome;
	private IControleAluno controleAluno;

	public Universidade() {
		this.nome = "Universidade";
		professores = new ArrayList<>();
		controleAluno = new ControleAluno();
	}

	public Universidade(String nome) {
		this.nome = nome;
		professores = new ArrayList<>();
		controleAluno = new ControleAluno();
	}

	public void setFaxineira(IFaxineira paramFaxineira) throws FuncionarioException {
		if (paramFaxineira.temAutorizacao()) {
			this.faxineira = paramFaxineira;
		} else {
			throw new FuncionarioException("Faxineira sem autorizacao");
		}
	}

	public void setJardineiro(IJardineiro paramJardineiro) throws FuncionarioException {
		if (paramJardineiro.temAutorizacao()) {
			this.jardineiro = paramJardineiro;
		} else {
			throw new FuncionarioException("Jardineiro sem autorizacao");
		}
	}

	public void diaDaLimpeza() {
		if (faxineira != null) {
			faxineira.lavar();
			faxineira.varrer();
			faxineira.tirarLixo();
		} else {
			System.out.println("Não há faxineira");
		}
		if (jardineiro != null) {
			jardineiro.cortarGrama();
		} else {
			System.out.println("Não há jardineiro");
		}
	}

	public void adicionarProfessor(IProfessor professor) throws FuncionarioException {
		if (professor.temAutorizacao()) {
			professores.add(professor);
		} else {
			throw new FuncionarioException("Professor sem autorizacao");
		}
	}

	public void listarProfessores() {
		if (professores.size() == 0) {
			System.out.println("Não existem professores");
		}
		for (IProfessor prof : professores) {
			System.out.println(prof.dadosPessoais());
		}
	}

	public String getNome() {
		return nome;
	}

	public void alterarNome(String nome) {
		this.nome = nome;
	}

	public void adicionarAluno(Aluno aluno) {
		this.controleAluno.adicionar(aluno);
	}

	public Aluno getAluno(int indice) throws AlunoException {
		return this.controleAluno.get(indice);
	}

	public void excluirAluno(int indice) throws AlunoException {
		controleAluno.excluir(indice);
	}

	public void listarAlunos() {
		if(controleAluno.listagem().size()==0){
			System.out.println("Não existem alunos adicionados");
		}
		try {
			for (int i = 0; i < controleAluno.listagem().size(); i++) {

				System.out.println(i + ") " + controleAluno.get(i).getNome());

			}
		} catch (AlunoException e) {}
	}

}
