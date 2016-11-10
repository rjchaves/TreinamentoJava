package br.com.rjchaves.banco.extrato;

import java.util.ArrayList;

import br.com.rjchaves.banco.contas.Conta;
import br.com.rjchaves.banco.extrato.operacoes.DepositoContaPropria;
import br.com.rjchaves.banco.extrato.operacoes.StatusOperacao;

public class Extrato {
	private ArrayList<EntradaExtrato> entradasExtrato;

	public Extrato() {
		this.entradasExtrato = new ArrayList<>();
	}

	public ArrayList<EntradaExtrato> getEntradasExtrato() {
		return entradasExtrato;
	}

	public void adicionarEntrada(EntradaExtrato entrada) {
		this.entradasExtrato.add(entrada);
	}
	
	public Extrato getExtratosConta(Conta conta){
		Extrato novoExtrato = new Extrato();
		for(EntradaExtrato entrada :  entradasExtrato){
			if(entrada.getConta().conferirDadosConta(conta)){
				novoExtrato.adicionarEntrada(entrada);
			}
		}
		return novoExtrato;
	}
	
	public Extrato getExtratosDepositosAguardandoAprovacao(){
		Extrato novoExtrato = new Extrato();
		for(EntradaExtrato entrada :  entradasExtrato){
			if(entrada instanceof DepositoContaPropria){
				if(((DepositoContaPropria)entrada).getAprovacao() == StatusOperacao.AGUARDANDO){
					novoExtrato.adicionarEntrada(entrada);
				}
			}
		}
		return novoExtrato;
	}
}
