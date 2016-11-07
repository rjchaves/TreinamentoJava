package br.com.rjchaves.banco.extrato.operacoes;

import java.util.Calendar;
import java.util.Date;

import br.com.rjchaves.banco.contas.Conta;
import br.com.rjchaves.banco.extrato.EntradaExtrato;

public class DepositoContaPropria implements EntradaExtrato{
	private Conta conta;
	private double valor;
	private Calendar horario; 
	private StatusOperacao statusAprovacao;
	
	
	public DepositoContaPropria(Conta conta, double valor) {
		this.conta = conta;
		this.valor = valor;
		this.horario = Calendar.getInstance();
		this.statusAprovacao = StatusOperacao.AGUARDANDO;
	}

	@Override
	public String getDescricao() {
		return "Depósito no valor de "+ valor + " Reais "+ statusAprovacao.getTexto();
	}

	@Override
	public Date getDataHora() {
		return this.horario.getTime();
	}

	@Override
	public double getValor() {
		return this.valor;
	}
	
	@Override
	public  Conta getConta() {
		return conta;
	}
	
	public void aprovarOperacao(){
		this.statusAprovacao = StatusOperacao.APROVADO;
		this.conta.adicionarMontanteAConta(this.valor);
	}
	
	public void recusarOperacao(){
		this.statusAprovacao = StatusOperacao.REJEITADA;
	}
	

	public StatusOperacao getAprovacao() {
		return statusAprovacao;
	}
	
	
	
}
