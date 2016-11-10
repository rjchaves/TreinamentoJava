package br.com.rjchaves.banco.extrato;


import java.util.Date;

import br.com.rjchaves.banco.contas.Conta;


public interface EntradaExtrato {
	public String getDescricao();
	public Date getDataHora();
	public double getValor();
	public Conta getConta();
	
}
