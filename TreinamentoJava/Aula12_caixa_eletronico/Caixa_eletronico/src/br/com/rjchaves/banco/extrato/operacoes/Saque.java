package br.com.rjchaves.banco.extrato.operacoes;

import java.util.Calendar;
import java.util.Date;

import br.com.rjchaves.banco.contas.Conta;
import br.com.rjchaves.banco.extrato.EntradaExtrato;

public class Saque implements EntradaExtrato{
	private double valor;
	private Conta conta;
	private Calendar horario; 
	
	
	
	public Saque(double valor, Conta conta) {
		this.valor = valor;
		this.conta = conta;
		this.horario = Calendar.getInstance();
	}

	@Override
	public String getDescricao() {
		return "Saque no valor de "+ valor +" Reais";
	}

	@Override
	public Date getDataHora() {
		return this.horario.getTime();
	}

	@Override
	public double getValor() {
		return valor;
	}

	public Conta getConta() {
		return conta;
	}
	
	
	
}
