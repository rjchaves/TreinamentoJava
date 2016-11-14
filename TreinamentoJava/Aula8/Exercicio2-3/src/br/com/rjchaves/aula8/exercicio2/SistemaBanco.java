package br.com.rjchaves.aula8.exercicio2;

import java.util.ArrayList;

public class SistemaBanco {
	private double totalAnteriorBanco;
	private double totalAtualizadoBanco;
	private ArrayList<Conta> contas;	
	
	public SistemaBanco(ArrayList<Conta> contas){
		this.contas = contas;
		this.totalAnteriorBanco = 0;
		this.totalAtualizadoBanco = 0;
	}
	
	public void atualizaContas(double taxa){
		int contador = 0;
		for(Conta c : contas){
			
			System.out.println("Conta " + contador);
			System.out.println("Saldo anterior: " + c.getSaldo());
			totalAnteriorBanco+= c.getSaldo();
			c.atualiza(taxa);
			System.out.println("Saldo Atual: " + c.getSaldo());
			this.totalAtualizadoBanco += c.getSaldo();
			System.out.println("-------------");
		}
		System.out.println("-------------------------------");
		System.out.println("Saldo  anterior total do banco: " + this.totalAnteriorBanco);
		System.out.println("Saldo atualizado total do banco: " + this.totalAtualizadoBanco);
	}
}
