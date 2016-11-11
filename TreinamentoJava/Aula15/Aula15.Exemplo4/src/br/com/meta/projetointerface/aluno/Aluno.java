package br.com.meta.projetointerface.aluno;

import br.com.meta.projetointerface.excecoes.AlunoException;

public class Aluno {
	private String nome;
	private String email;
	private String endereco;
	private String bairro;
	private String cidade;
	private String cep;
	private String estado;
	private String pais;
	private String telefone;
	
	public Aluno(String nome, 
			String email, 
			String endereco, 
			String bairro, 
			String cidade, 
			String cep, 
			String estado,
			String pais, 
			String telefone) throws AlunoException {
		
		validaString(nome);
		validaString(email);
		validaString(bairro);
		validaString(cidade);
		validaString(cep);
		validaString(estado);
		validaString(pais);
		validaString(telefone);
		
		validaEmail(email);
		
		
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.estado = estado;
		this.pais = pais;
		this.telefone = telefone;
	}
	
	private void validaString(String str) throws AlunoException{
		if(str == null)
			throw new AlunoException("Aluno não pode conter campos nulos");
	}
	
	private void validaEmail(String email) throws AlunoException{
		if(!email.contains("@") || !email.contains(".")){
			throw new AlunoException("O e-mail do aluno não é válido");
		}
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getCep() {
		return cep;
	}

	public String getEstado() {
		return estado;
	}

	public String getPais() {
		return pais;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) throws AlunoException {
		validaString(nome);
		this.nome = nome;
	}

	public void setEmail(String email) throws AlunoException {
		validaString(email);
		validaEmail(email);
		this.email = email;
	}

	public void setEndereco(String endereco) throws AlunoException {
		validaString(endereco);
		this.endereco = endereco;
	}

	public void setBairro(String bairro) throws AlunoException {
		validaString(bairro);
		this.bairro = bairro;
	}

	public void setCidade(String cidade) throws AlunoException {
		validaString(cidade);
		this.cidade = cidade;
	}

	public void setCep(String cep) throws AlunoException {
		validaString(cep);
		this.cep = cep;
	}

	public void setEstado(String estado) throws AlunoException {
		validaString(estado);
		this.estado = estado;
	}

	public void setPais(String pais) throws AlunoException {
		validaString(pais);
		this.pais = pais;
	}

	public void setTelefone(String telefone) throws AlunoException {
		validaString(telefone);
		this.telefone = telefone;
	}
	
	
	
	
}
