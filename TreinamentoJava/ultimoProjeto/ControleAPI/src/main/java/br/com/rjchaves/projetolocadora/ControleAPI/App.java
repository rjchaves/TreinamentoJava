package br.com.rjchaves.projetolocadora.ControleAPI;

import java.util.HashMap;

import java.util.Locale;

import java.util.Scanner;

import br.com.rjchaves.projetolocadora.dao.FilmeDAO;
import br.com.rjchaves.projetolocadora.troco.Troco;
import br.com.rjchaves.projetolocadora.troco.unidademonetaria.EUnidadeMonetariaCentavos;
import br.com.rjchaves.projetolocadora.troco.unidademonetaria.EUnidadeMonetariaReais;
import br.com.rjchaves.projetolocadora.troco.unidademonetaria.IUnidadeMonetaria;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		/*Scanner input = new Scanner(System.in).useLocale(Locale.US);
		HashMap<IUnidadeMonetaria, Integer> troco = Troco.getTrocoFromValor(input.nextDouble());

		if (troco.isEmpty()) {
			System.out.println("vazio");
		} else {
			for (EUnidadeMonetariaReais unidade : EUnidadeMonetariaReais.values()) {
				if (troco.containsKey(unidade)) {
					int totalTrocoUnidade = troco.get(unidade);
					System.out.println(totalTrocoUnidade + " " + unidade.getFormatoFisicoUnidadeMonetaria() + " "
							+ "De " + unidade.getNomeUnidadeMonetaria() + " "
							+ unidade.getTipoUnidadeMonetaria().getNome());
				}
			}

			for (EUnidadeMonetariaCentavos unidade : EUnidadeMonetariaCentavos.values()) {
				if (troco.containsKey(unidade)) {
					int totalTrocoUnidade = troco.get(unidade);
					System.out.println(totalTrocoUnidade + " " + unidade.getFormatoFisicoUnidadeMonetaria() + " "
							+ "De " + unidade.getNomeUnidadeMonetaria() + " "
							+ unidade.getTipoUnidadeMonetaria().getNome());
				}
			}
		}*/
		
		try {
			new FilmeDAO().pesq(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
