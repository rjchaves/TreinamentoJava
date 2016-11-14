package br.com.rjchaves.aula8.exercicio2;

public class ContaCorrente extends Conta{
	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa){
		super.atualiza(taxa*2);
	}
	
	public void depositar(double deposito) {
		super.depositar(deposito-0.10);
	}
}
