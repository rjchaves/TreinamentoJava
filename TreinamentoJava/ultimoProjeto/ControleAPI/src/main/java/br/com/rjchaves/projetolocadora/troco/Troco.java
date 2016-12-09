package br.com.rjchaves.projetolocadora.troco;

import java.util.HashMap;

import br.com.rjchaves.projetolocadora.troco.unidademonetaria.EUnidadeMonetariaCentavos;
import br.com.rjchaves.projetolocadora.troco.unidademonetaria.EUnidadeMonetariaReais;
import br.com.rjchaves.projetolocadora.troco.unidademonetaria.IUnidadeMonetaria;

public class Troco {
	public static HashMap<IUnidadeMonetaria, Integer> getTrocoFromValor(double valor) {
		HashMap<IUnidadeMonetaria, Integer> troco = new HashMap<>();
		int valorInteiro = (int) valor;
		int valorFracionado = (int) ((valor - valorInteiro) * 100);

		System.out.println("Valor Inteiro = " + valorInteiro);
		System.out.println("Valor Fracionado = " + valorFracionado);
		calculaTrocoInteiro(troco, valorInteiro);
		calculaTrocoFracionado(troco, valorFracionado);		
		
		return troco;
	}

	public static void calculaTrocoInteiro(HashMap<IUnidadeMonetaria, Integer> troco, int valorInteiro) {
		if(valorInteiro % 2 != 0){ ///é ímpar
			EUnidadeMonetariaReais unidadeMonetariaReais = 
					EUnidadeMonetariaReais.getMaiorUnidadeImparPossivel(valorInteiro);
			troco.put(unidadeMonetariaReais, 1);
			valorInteiro -= unidadeMonetariaReais.getValorUnidadeMonetaria();
		}
		for (EUnidadeMonetariaReais unidadeMonetaria : EUnidadeMonetariaReais.values()) {

			int totalUnidade = valorInteiro / unidadeMonetaria.getValorUnidadeMonetaria();

			valorInteiro -= totalUnidade * unidadeMonetaria.getValorUnidadeMonetaria();
			if (totalUnidade > 0) {
				if (!troco.containsKey(unidadeMonetaria)) {
					troco.put(unidadeMonetaria, totalUnidade);
				} else {
					troco.put(unidadeMonetaria, troco.get(unidadeMonetaria) + totalUnidade);
				}

			}
		}
	}
	
	public static void calculaTrocoFracionado(HashMap<IUnidadeMonetaria, Integer> troco, int valorFracionado){
		if(valorFracionado % 2 != 0){ ///é ímpar
			EUnidadeMonetariaCentavos unidadeMonetariaCentavos = 
					EUnidadeMonetariaCentavos.getMaiorUnidadeImparPossivel(valorFracionado);
			troco.put(unidadeMonetariaCentavos, 1);
			valorFracionado -= unidadeMonetariaCentavos.getValorUnidadeMonetaria();
		}
		for (EUnidadeMonetariaCentavos unidadeMonetaria : EUnidadeMonetariaCentavos.values()) {

			int totalUnidade = valorFracionado / unidadeMonetaria.getValorUnidadeMonetaria();

			valorFracionado -= totalUnidade * unidadeMonetaria.getValorUnidadeMonetaria();
			if (totalUnidade > 0) {
				if (!troco.containsKey(unidadeMonetaria)) {
					troco.put(unidadeMonetaria, totalUnidade);
				} else {
					troco.put(unidadeMonetaria, troco.get(unidadeMonetaria) + totalUnidade);
				}
			}
		}
	}
}
