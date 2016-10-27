package br.com.rjchaves.aula7.exercicio4;

public class TesteFuncionario {
	public static void main(String[] args){
		Vendedor vendedor1 = new Vendedor("Vendedor1", "23233556786543245", 1000);
		Vendedor vendedor2 = new Vendedor("Vendedor2", "232335567865432", 1000);
		Administrativo administrativo1 = new Administrativo("Administrativo1", "2326786543245", 1000);
		Administrativo administrativo2 = new Administrativo("Administrativo2", "232786543245", 1000);
		
		System.out.println("Mês 1");
		System.out.println("----------------------------------");
		vendedor1.imprimeSalario();
		vendedor2.acumulaTotalVendas(1000);
		vendedor2.imprimeSalario();
		
		administrativo1.imprimeSalario();
		administrativo2.acumulaHorasExtras(10);
		administrativo2.imprimeSalario();
		
		System.out.println("Mês 2");
		System.out.println("----------------------------------");
		
		vendedor1.acumulaTotalVendas(1000);
		vendedor1.imprimeSalario();
		vendedor2.imprimeSalario();
		
		administrativo1.acumulaHorasExtras(10);
		administrativo1.imprimeSalario();
		administrativo2.imprimeSalario();
		
	} 
}
