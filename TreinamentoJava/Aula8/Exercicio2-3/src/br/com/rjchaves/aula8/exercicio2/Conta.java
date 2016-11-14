package br.com.rjchaves.aula8.exercicio2;

public class Conta {
	private double saldo;

	public Conta(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double saldo) {
		this.saldo += saldo;
	}
	
	public void sacar(double saldo) {
		this.saldo -= saldo;
	}
	
	public void atualiza(double taxa){
		this.saldo = saldo*(1+taxa);
	}
	
}
