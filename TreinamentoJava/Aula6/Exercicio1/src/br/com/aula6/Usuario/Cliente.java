package br.com.aula6.Usuario;

import java.util.Scanner;

import br.com.aula6.Impressao;
import br.com.aula6.banco.Caixa;
import br.com.aula6.banco.Montante;

public class Cliente {
	private Caixa caixa;

	public Cliente(Caixa caixa) {
		this.caixa = caixa;
	}

	private void mostrarCedulas() {
		boolean existeNotas = false;

		Montante montanteCaixa = caixa.getMontante();
		System.out.print("C�dulas dispon�veis: ");
		Impressao.imprimirCedulasDisponiveis(montanteCaixa);

	}

	public void menuCliente() {
		int entrada;
		do {
			mostrarCedulas();
			System.out.println("Digite o numero correspondente a op��o desejada");
			System.out.println("1) Realizar saque");
			System.out.println("0) Sair");
			Scanner in = new Scanner(System.in);
			entrada = in.nextInt();
			

			switch (entrada) {
			case 1:
				sacar();
				break;
			case 0:
				break;
			default:
				System.out.println("Entrada inv�lida");
				break;
			}
		} while (entrada != 0);
	}

	public void sacar() {
		int entrada;
		System.out.println("Digite o valor a ser sacado");
		
		Scanner in = new Scanner(System.in);
		entrada = in.nextInt();
		
		
		Montante sacado = caixa.sacar(entrada);
		if(sacado==null){
			System.out.println("N�o � poss�vel sacar esse valor");
			return;
		}
		imprimirSacado(sacado);
	}
	
	
	private void imprimirSacado(Montante sacado){
		System.out.println("C�dulas sacadas:");
		Impressao.imprimirCedulasMontante(sacado);
	}
}
