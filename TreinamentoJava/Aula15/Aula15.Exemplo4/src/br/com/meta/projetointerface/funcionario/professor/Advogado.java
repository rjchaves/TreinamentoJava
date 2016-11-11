package br.com.meta.projetointerface.funcionario.professor;

import br.com.meta.projetointerface.interfaces.IProfessor;

public class Advogado implements IProfessor {
	private int idade;
	boolean temDoutorado;
	private String nome;
	
	
	
    public Advogado(int idade, boolean temDoutorado, String nome) {
		this.idade = idade;
		this.temDoutorado = temDoutorado;
		this.nome = nome;
	}

	@Override
    public void darAula() {
        System.out.println("Advogado - darAula");
    }

    @Override
    public void lancarNotas() {
        System.out.println("Advogado - lancarNotas");
    }

    @Override
    public String dadosPessoais() {
    	StringBuilder str = new StringBuilder("\nAdvogado");
    	str.append("\nNome: "+nome);
    	str.append("\nIdade: "+idade);
        return str.toString();
    }

    @Override
    public Boolean temAutorizacao() {
        return true;
    }

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public void setDoutorado(boolean b) {
		this.temDoutorado = b;
	}
    
}