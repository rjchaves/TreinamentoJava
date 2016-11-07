package br.com.rjchaves.banco.contas;

import br.com.rjchaves.banco.extrato.EntradaExtrato;
import br.com.rjchaves.banco.extrato.Extrato;

public class Conta {
	private int agencia;
	private int conta;
	private String senha;
	private double saldo;

	public Conta() {
		agencia = -1;
		conta = -1;
		senha = "";
		saldo = 0;
	}

	public Conta(int agencia, int conta, String senha) {
		this.agencia = agencia;
		this.conta = conta;
		this.senha = senha;
	}
	
	
	public double getSaldo() {
		return saldo;
	}

	public void adicionarMontanteAConta(double montante){
		this.saldo += montante;
	}
	
	public void retirarMontanteAConta(double montante){
		this.saldo -= montante;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public String getSenha() {
		return senha;
	}


	public boolean conferirDadosConta(Conta conta) {
		return (this.getAgencia() == conta.getAgencia() 
				&& this.getConta() == conta.getConta()
				&& this.getSenha().equals(conta.getSenha())); 

	}
}
