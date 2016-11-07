package exercicio_1_1.tela;

import java.util.Scanner;

import br.com.rjchaves.banco.SistemaBanco;
import br.com.rjchaves.banco.contas.Conta;
import exercicio_1_1.caixa.CaixaEletronico;
import exercicio_1_1.tela.modulos.ModuloBanco;
import exercicio_1_1.tela.modulos.ModuloCliente;
import exercicio_1_1.tela.util.Util;

public class Tela {
	private Conta contaAdmin;
	private CaixaEletronico caixa;
	private SistemaBanco banco;

	public Tela(SistemaBanco banco) {
		this.contaAdmin = new Conta(999, 999, "123mudar");
		this.banco = banco;
		this.caixa = new CaixaEletronico();
	}

	public void run() {

		// Declaração das variaveis
		Scanner input = new Scanner(System.in);

		// -------------------------------------------------------------//

		String tipoAcesso = "";
		Util.clearConsole();

		// -------------------------------------------------------------//
		do {

			System.out.println("------>BEM VINDO AO BANCO PANDESCO<------");

			System.out.println("Digite a opção desejada");
			System.out.println("1) Acessar sua conta Pandesco");
			System.out.println("0) Sair do sistema");
			tipoAcesso = input.nextLine();
			Util.clearConsole();
			
			switch (tipoAcesso.charAt(0)) {
			case '1':
				Conta contaLogin = getContaLoginDoCliente();
				if (this.contaAdmin.conferirDadosConta(contaLogin)) {
					autenticarAdministrador();
				} else {
					autenticarCliente(contaLogin);
				}
				break;
			case '0':
				break;
			default:
				
				System.out.println("Opção inválida, tente novamente");
				break;
			}

		} while (tipoAcesso.charAt(0) != '0');
	}

	
	
	// Verifica se a conta é de admin, se não apenas loga
	private void autenticarCliente(Conta contaLogin) {

		Conta contaLogada = banco.autenticar(contaLogin);
		if (contaLogada != null) {
			new ModuloCliente(this.caixa, contaLogada, banco).run();
		} else {
			System.out.println("Dados não conferem");
		}

	}

	private void autenticarAdministrador() {
		
		Scanner input = new Scanner(System.in);
		

		new ModuloBanco(this.caixa, banco).run();

	}

	private Conta getContaLoginDoCliente() {
		Conta conta = new Conta();
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua agencia");
		conta.setAgencia(input.nextInt());
		System.out.println("Digite sua conta");
		conta.setConta(input.nextInt());

		input.nextLine(); /// Limpeza de buffer;
		System.out.println("Digite sua senha");
		conta.setSenha(input.nextLine());
		return conta;
	}
}
