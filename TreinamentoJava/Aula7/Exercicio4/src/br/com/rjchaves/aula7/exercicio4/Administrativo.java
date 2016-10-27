package br.com.rjchaves.aula7.exercicio4;

public class Administrativo extends Funcionario{
	public Administrativo(double salario){
		super(salario);
	}
	
	public Administrativo(String nome, String rG, double salario) {
		super(nome, rG, salario);
	}
	
	private double calculaHorasExtras(float horas){
		return (horas*(this.getSalarioBase()/100));
	}
	
	public void acumulaHorasExtras(float horas){
		this.setSalario(calculaHorasExtras(horas)+this.getSalario());
	}
}
