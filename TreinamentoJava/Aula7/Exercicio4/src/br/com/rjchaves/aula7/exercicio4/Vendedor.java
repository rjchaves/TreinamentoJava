package br.com.rjchaves.aula7.exercicio4;

public class Vendedor extends Funcionario{
	
	public Vendedor(double salario){
		super(salario);
	}
	
	public Vendedor(String nome, String rG, double salario) {
		super(nome, rG, salario);
	}
	
	public void acumulaTotalVendas(double totalVendas){
		this.setSalario(totalVendas*1.05);
	}
}
