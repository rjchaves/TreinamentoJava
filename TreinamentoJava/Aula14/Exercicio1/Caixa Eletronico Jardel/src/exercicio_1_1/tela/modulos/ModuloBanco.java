package exercicio_1_1.tela.modulos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.rjchaves.banco.SistemaBanco;
import br.com.rjchaves.banco.extrato.EntradaExtrato;
import br.com.rjchaves.banco.extrato.Extrato;
import br.com.rjchaves.banco.extrato.operacoes.DepositoContaPropria;
import exercicio_1_1.caixa.CaixaEletronico;
import exercicio_1_1.caixa.Cedulas;
import exercicio_1_1.tela.util.Util;

public class ModuloBanco {
	private CaixaEletronico caixa;
	private SistemaBanco banco;

	public ModuloBanco(CaixaEletronico caixa, SistemaBanco banco) {
		this.caixa = caixa;
		this.banco = banco;
	}

	/// fazendo
	private void extratoCaixa() {
		Util.clearConsole();
		System.out.println("Extrato:");
		for (EntradaExtrato entrada : banco.getExtrato().getEntradasExtrato()) {
			System.out.println(entrada.getDataHora() + " " + entrada.getDescricao());
		}
	}

	private void esvaziarCedulas() {
		Util.clearConsole();
		System.out.println("Retirar notas");
		ArrayList<Cedulas> cedulas = caixa.getCedulas();
		Scanner input = new Scanner(System.in);
		for (Cedulas ced : cedulas) {
			do {
				System.out.println(
						"Quantas notas de " + ced.getValorNota() + " retirar? (" + ced.getQntNotas() + " Disponíveis)");
				if (!caixa.esvaziarCedulas(ced.getValorNota(), input.nextInt())) {
					Util.clearConsole();
					System.out.println("Não é possível retirar esse valor");
				} else {
					break;
				}
			} while (true);

		}
	}

	private void reporCedulas() {

		Scanner input = new Scanner(System.in);
		System.out.println("Quantidade de notas de R$ 50,00: ");
		caixa.adicionarCedula(50, input.nextInt());
		System.out.println("Notas inseridas");
		System.out.println("Quantidade de notas de R$ 20,00: ");
		caixa.adicionarCedula(20, input.nextInt());
		System.out.println("Notas inseridas");
		System.out.println("Quantidade de notas de R$ 10,00: ");
		caixa.adicionarCedula(10, input.nextInt());
		System.out.println("Notas inseridas");
		System.out.println("Quantidade de notas de R$ 05,00: ");
		caixa.adicionarCedula(5, input.nextInt());
		System.out.println("Notas inseridas");
		System.out.println("Quantidade de notas de R$ 02,00: ");
		caixa.adicionarCedula(2, input.nextInt());
		System.out.println("Notas inseridas");
	}

	private void analizarDepositos() {
		Util.clearConsole();
		Scanner input = new Scanner(System.in);
		int entrada;
		if (banco.getExtratosDepositosAguardandoAprovacao().getEntradasExtrato().size() != 0) {
			for (EntradaExtrato entradaExtrato : banco.getExtratosDepositosAguardandoAprovacao().getEntradasExtrato()) {
				DepositoContaPropria deposito = ((DepositoContaPropria) entradaExtrato);
				do {
					System.out.println("Horario:" + deposito.getDataHora() + deposito.getDescricao());
					System.out.println("Digite 1 para aprovar, 2 para reprovar");
					entrada = input.nextInt();

					switch (entrada) {
					case 1:
						deposito.aprovarOperacao();
						break;
					case 2:
						deposito.recusarOperacao();
						break;

					default:
						System.out.println("Entrada inválida, tente novamente");
						break;
					}
				} while (entrada != 1 && entrada != 2);
			}
		} else {
			System.out.println("Não há depositos pendentes");
		}
	}

	private void consultarSaldoCaixa() {
		System.out.println("Saldo disponível: " + caixa.valorTotal() + " Reais");
	}

	public void run() {
		Util.clearConsole();
		Scanner input = new Scanner(System.in);
		int entrada = -1;
		do {
			try {
				System.out.println("Digite o valor da opção desejada");
				System.out.println("1) Exibir extrato do caixa");
				System.out.println("2) Esvaziar cedulas");
				System.out.println("3) Repor cedulas");
				System.out.println("4) Consular saldo disponivel no caixa");
				System.out.println("5) Analizar depósitos");
				System.out.println("0) Sair");
				entrada = input.nextInt();
				Util.clearConsole();
				switch (entrada) {
				case 1:
					this.extratoCaixa();
					;
					break;
				case 2:
					this.esvaziarCedulas();
					;
					break;
				case 3:
					this.reporCedulas();
					;
					break;
				case 4:
					this.consultarSaldoCaixa();
					break;
				case 5:
					this.analizarDepositos();
					break;
				case 0:
					break;
				default:
					Util.clearConsole();
					System.out.println("Opção inválida, tente novamente");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Apenas valores numericos são permitidos");
				input.nextLine();
			}
		} while (entrada != 0);
	}
}
