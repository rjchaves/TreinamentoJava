package br.com.rjchaves.aula8.exercicio2;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa){
		super.atualiza(taxa*3);
	}
}
