package br.com.rjchaves.aula8.exercicio2;

import java.util.ArrayList;

public class TestaContas {
	public static void main(String[] args){
		Conta conta = new Conta(500);
		ContaCorrente contaCorrente = new ContaCorrente(500);
		ContaPoupanca contaPoupanca = new ContaPoupanca(500);
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(conta);
		contas.add(contaCorrente);
		contas.add(contaPoupanca);
		
		System.out.println("Conta Normal " + conta.getSaldo());
		System.out.println("Conta Corrente " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança " + contaPoupanca.getSaldo());
		
		System.out.println("\n");
		
		conta.depositar(500);
		System.out.println("Conta normal deposita 500");
		
		
		contaCorrente.depositar(500);
		System.out.println("Conta corrente deposita 500");
		
		
		contaPoupanca.depositar(500);
		System.out.println("Conta poupança deposita 500");
		
		System.out.println("Conta Normal " + conta.getSaldo());
		System.out.println("Conta Corrente " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança " + contaPoupanca.getSaldo());
		
		System.out.println("-------------------------------");
		System.out.println("Atualizando contas a 10%");
		SistemaBanco banco = new SistemaBanco(contas);
		banco.atualizaContas(0.1);
	}
}
