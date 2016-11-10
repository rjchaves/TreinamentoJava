package br.com.rjchaves.banco;

import br.com.rjchaves.banco.contas.Conta;
import br.com.rjchaves.banco.contas.Contas;
import br.com.rjchaves.banco.extrato.EntradaExtrato;
import br.com.rjchaves.banco.extrato.Extrato;

public class SistemaBanco {
	private Contas contas;
	private Extrato extratoBanco;
	
	
	public SistemaBanco(){
		contas = new Contas();
		extratoBanco = new Extrato();
	}
	
	public Conta autenticar(Conta conta){
		return contas.autenticar(conta);
	}
	
	
	
	public void adicionarEntradaExtrato(EntradaExtrato entrada){
		extratoBanco.adicionarEntrada(entrada);
	}
	
	public Extrato getExtratoConta(Conta conta){
		return extratoBanco.getExtratosConta(conta);
	}
	
	public Extrato getExtratosDepositosAguardandoAprovacao(){
		return this.extratoBanco.getExtratosDepositosAguardandoAprovacao();
	}
	
	public Extrato getExtrato(){
		return extratoBanco;
	}

}
