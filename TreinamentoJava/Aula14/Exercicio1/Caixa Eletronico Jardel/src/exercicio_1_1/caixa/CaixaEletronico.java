package exercicio_1_1.caixa;

import java.util.ArrayList;

import br.com.rjchaves.banco.contas.Conta;
import exercicio_1_1.Mensagem;

public class CaixaEletronico {
	private String senhaV = "adm"; // Senha inicial
	private ArrayList<Cedulas> cedulas;
	private int valorTotal;

	// -------------------------------------------------------------//

	public CaixaEletronico() {
		cedulas = new ArrayList<>();
		this.criarLista();
	}

	// -------------------------------------------------------------//

	public void criarLista() {
		cedulas.add(new Cedulas("Cinquenta", 50, 20));
		cedulas.add(new Cedulas("Vinte", 20, 20));
		cedulas.add(new Cedulas("Dez", 10, 20));
		cedulas.add(new Cedulas("Cinco", 5, 20));
		cedulas.add(new Cedulas("Dois", 2, 20));
	}

	// -------------------------------------------------------------//

	public boolean validacaoSenha(String senha) {
		if (senha == senhaV) {
			return true;
		} else {
			return false;
		}
	}

	// -------------------------------------------------------------//

	public int valorTotal() {
		String text = "";
		int total = 0;

		for (Cedulas cedulas : cedulas) {
			text = (text + cedulas.getNomeNota() + " -> " + cedulas.getQntNotas() + " cedulas\n");
			total = total + (cedulas.getQntNotas() * cedulas.getValorNota());
		}

		return total;
	}

	// -------------------------------------------------------------//

	public void total() {
		valorTotal = 0;
		for (Cedulas cedulas : cedulas) {
			valorTotal = valorTotal + (cedulas.getQntNotas() * cedulas.getValorNota());
		}
	}

	// -------------------------------------------------------------//

	public void adicionarCedula(int valor, int quantidade) {
		for (Cedulas nota : cedulas) {
			if (nota.getValorNota() == valor)
				nota.setQntNotas(nota.getQntNotas() + quantidade);
		}
	}

	// -------------------------------------------------------------//

	public String celulasDisponiveis() {
		String text = "";
		for (Cedulas nota : cedulas) {
			if (nota.getQntNotas() > 0)
				text = (text + "R$ " + nota.getValorNota() + "\t");
		}

		return text;
	}

	// -------------------------------------------------------------//

	/// Novos métodos
	public String totalCedulas() {
		String text = "";
		for (Cedulas nota : cedulas) {
			if (nota.getQntNotas() > 0)
				text = (nota.getQntNotas() + "Notas de " + text + "R$ " + nota.getValorNota() + "\n");
		}

		return text;
	}

	public boolean esvaziarCedulas(int valorCedula, int quantidadeRetirada) {
		for (Cedulas ced : this.cedulas) {
			if (ced.getValorNota() == valorCedula) {
				if (ced.getQntNotas() >= quantidadeRetirada) {
					ced.setQntNotas(ced.getQntNotas() - quantidadeRetirada);
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public ArrayList<Cedulas> getCedulas() {
		return this.cedulas;
	}

	private Cedulas getCedulasPorValor(int valor) {
		for (Cedulas ced : this.cedulas) {
			if (ced.getValorNota() == valor) {
				return ced;
			}
		}
		return null;
	}

	private int calculaTotalCedulasDoValor(int valorSaque, Cedulas cedula) {
		int totalCedulas = valorSaque / cedula.getValorNota();
		if (((valorSaque - (cedula.getValorNota() * totalCedulas)) % 2 != 0 && totalCedulas > 0)) {
			totalCedulas--;
		}
		if (totalCedulas > cedula.getQntNotas()) { /// Se não houverem notas
													/// desse tipo suficientes
													/// no caixa
			int resto = valorSaque - (cedula.getQntNotas() * cedula.getValorNota());
			if (resto % 2 != 0) {
				if (cedula.getQntNotas() > 0) {
					totalCedulas = cedula.getQntNotas() - 1;
				} else {
					totalCedulas = 0;
				}
			} else {
				totalCedulas = cedula.getQntNotas();
			}
		}
		return totalCedulas;
	}

	private boolean simulaSaque(int valorSaque) {
		int i = 0;
		System.out.println(valorTotal());
		if (valorSaque < valorTotal()) {
			if (valorSaque % 2 != 0) { // é ímpar
				Cedulas cedulas5 = this.getCedulasPorValor(5);
				if (cedulas5.getQntNotas() > 0) {
					valorSaque -= 5;
				}
			}

			for (Cedulas nota : cedulas) {
				valorSaque -= (calculaTotalCedulasDoValor(valorSaque, nota)) * nota.getValorNota();
			}

			if (valorSaque == 0) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	// -------------------------------------------------------------//
	public Mensagem sacar(int valorSaque, Conta conta) {
		Mensagem mensagem = new Mensagem();
		
		
		if (valorSaque <= conta.getSaldo()) {

			boolean nota5Adicionada = false;

			StringBuilder strRetorno = new StringBuilder();
			if (this.simulaSaque(valorSaque)) {

				if (valorSaque % 2 != 0) { // é ímpar
					Cedulas cedulas5 = this.getCedulasPorValor(5);
					if (cedulas5.getQntNotas() > 0) {
						valorSaque -= 5;
						nota5Adicionada = true;
					}
				}

				for (Cedulas nota : cedulas) {
					int totalCedulasDesseValor = (calculaTotalCedulasDoValor(valorSaque, nota));
					valorSaque -= totalCedulasDesseValor * nota.getValorNota();
					
					if (nota.getValorNota() == 5 && nota5Adicionada) {
						totalCedulasDesseValor++;
					} 
					strRetorno.append("Notas de " + nota.getValorNota() + " reais" + totalCedulasDesseValor + "\n");
					nota.setQntNotas(nota.getQntNotas()-totalCedulasDesseValor);
				}
				mensagem.setStatus(true);
				mensagem.setMensagem(strRetorno.toString());
			} else {
				mensagem.setStatus(false);
				mensagem.setMensagem("Não é possível sacar esse valor\n");
			}
		}else{
			mensagem.setStatus(false);
			mensagem.setMensagem("Você não possui saldo suficiente\n");
		}
		return mensagem;
	}

}
