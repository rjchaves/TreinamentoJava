package br.com.rjchaves.aula7.exercicio4;

public class Funcionario {
	private String nome;
	private String RG;
	private double salario;
	private final double salarioBase; 
	
	public Funcionario(double salario){
		this.salario = salario;
		this.salarioBase = salario;
	}
	
	
	
	public Funcionario(String nome, String rG, double salario) {
		super();
		this.nome = nome;
		this.RG = rG;
		this.salario = salario;
		this.salarioBase = salario;
	}

	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		nome = nome;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getSalarioBase(){
		return salarioBase;
	}
	
	public void imprimeSalario(){
		System.out.println("Funcionario: "+this.nome);
		System.out.println("Salario: "+this.salario);
		this.salario=salarioBase;
	}
}
