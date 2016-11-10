package exercicio_1_1.tela.modulos;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.rjchaves.banco.SistemaBanco;
import br.com.rjchaves.banco.contas.Conta;
import br.com.rjchaves.banco.extrato.EntradaExtrato;
import br.com.rjchaves.banco.extrato.Extrato;
import br.com.rjchaves.banco.extrato.operacoes.DepositoContaPropria;
import br.com.rjchaves.banco.extrato.operacoes.Saque;
import exercicio_1_1.Mensagem;
import exercicio_1_1.caixa.CaixaEletronico;
import exercicio_1_1.tela.util.Util;

public class ModuloCliente {
	private CaixaEletronico caixa;
	private Conta conta;
	private SistemaBanco banco;

	public ModuloCliente(CaixaEletronico caixa, Conta conta, SistemaBanco banco) {
		this.caixa = caixa;
		this.conta = conta;
		this.banco = banco;
	}

	private void consultarSaldo() {

		System.out.println("Saldo disponível: " + conta.getSaldo() + " Reais");
	}

	private void exibirExtrato() {

		System.out.println("Extrato:");
		Extrato extratoConta = banco.getExtratoConta(conta);
		for (EntradaExtrato entrada : extratoConta.getEntradasExtrato()) {
			System.out.println(entrada.getDataHora() + " " + entrada.getDescricao());
		}
	}

	private void depositar() {

		Scanner input = new Scanner(System.in);
		System.out.println("Insira o valor do depósito");
		try {
			double valorDeposito = input.nextDouble();

			DepositoContaPropria deposito = new DepositoContaPropria(this.conta, valorDeposito);

			banco.adicionarEntradaExtrato(deposito);

			System.out.println("Valor depositado, aguardando aprovação");
		} catch (InputMismatchException e) {
			// limpa o buffer
			input.nextLine();
			System.out.println("Valor inválido, depósito não completado");
		}
	}

	private void sacar() {
		int valorSaque;
		Scanner input = new Scanner(System.in);
		System.out.println("\nCelulas Disponíveis:\n");
		System.out.println(caixa.celulasDisponiveis() + "\n");

		System.out.println("Digite o valor que você deseja sacar: ");
		try {
			valorSaque = input.nextInt();

			Mensagem mensagemSacado = caixa.sacar(valorSaque, conta);
			System.out.println(mensagemSacado.getMensagem());

			if (mensagemSacado.getStatus()) {
				conta.retirarMontanteAConta(valorSaque);
				banco.adicionarEntradaExtrato(new Saque(valorSaque, conta));
			}
		} catch (InputMismatchException e) {
			// limpa o buffer
			input.nextLine();
			System.out.println("Valor inválido, saque cancelado");
		}
	}

	public void run() {
		Util.clearConsole();
		Scanner input = new Scanner(System.in);
		int entrada;
		do {
			System.out.println("Digite o valor da opção desejada");
			System.out.println("1) Consultar saldo");
			System.out.println("2) Verificar Extrato");
			System.out.println("3) Realizar depósito");
			System.out.println("4) Realizar saque");
			System.out.println("0) Sair");
			try {
				entrada = input.nextInt();
			} catch (InputMismatchException e) {
				// limpa o buffer
				input.nextLine();
				entrada = -1;
			}

			Util.clearConsole();
			switch (entrada) {
			case 1:
				this.consultarSaldo();
				break;
			case 2:
				this.exibirExtrato();
				break;
			case 3:
				this.depositar();
				break;
			case 4:
				this.sacar();
				break;
			case 0:
				break;
			default:
				Util.clearConsole();
				System.out.println("Opção inválida, tente novamente");
				break;
			}
		} while (entrada != 0);
	}
}
