package br.com.aula6.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Montante {
	///HashMap com as quantidades de cada nota, usando EnumCedula de chave
	private HashMap<EnumCedulas, Integer> cedulas;

	public Montante() {
		cedulas = new HashMap<EnumCedulas, Integer>();
		
		for(EnumCedulas e : EnumCedulas.values()){
			cedulas.put(e, 20);
		}
	}

	public HashMap<EnumCedulas, Integer> getCedulas() {
		return cedulas;
	}

	public int getTotalCedulas(EnumCedulas e) {
		return cedulas.get(e);
	}

	public void adicionaCedulas(EnumCedulas e, int quantidade) {
		cedulas.put(e, cedulas.get(e)+quantidade);
	}
	
	public void setQuantidadeCedulas(EnumCedulas e, int quantidade){
		cedulas.put(e, quantidade);
	}

	public void somaMontante(Montante montante) {

		for(EnumCedulas e : EnumCedulas.values()){
			cedulas.put(e, cedulas.get(e)+montante.getCedulas().get(e));
		}
	}

	public void reduzMontante(Montante montante) {
		for(EnumCedulas e : EnumCedulas.values()){
			cedulas.put(e, cedulas.get(e)-montante.getCedulas().get(e));
		}	
	}

	public Montante copiarMontante() {
		Montante novoMontante = new Montante();
		for(EnumCedulas e : EnumCedulas.values()){
			cedulas.get(e);
			novoMontante.setQuantidadeCedulas(e, cedulas.get(e));
		}
		return novoMontante;
	}

	public int getTotalMontante() {
		int totalDisponivel = 0;
		for(EnumCedulas e : EnumCedulas.values()){
			totalDisponivel+=cedulas.get(e)*e.getValorNota();
		}
		
		return totalDisponivel;
	}

	private boolean validaRetirada(int valor) {
		if (valor <= this.getTotalMontante()) {
			for(EnumCedulas e: EnumCedulas.values()){
				int totalCedulas = this.geraNumeroCedulas(valor, e, cedulas.get(e));
				valor-=(e.getValorNota()*totalCedulas);
			}
			System.out.println(valor);
			return (valor == 0);
		} else {
			System.out.println("Não tem dinheiro");
			return false;
		}
	}
	
	private int geraNumeroCedulas (int valor, EnumCedulas e, int maxCedulas){
		int totalCedulas = valor/e.getValorNota();
		int valorMaximoCedulas = maxCedulas*e.getValorNota(); 
		if(valorMaximoCedulas>valor){ ///Evitar que sejam emitidas mais cedulas do que existem no caixa :p 
			
			if(e.getValorNota()%2 !=0 ){ ///Cedulas ímpares
				if(valor%e.getValorNota()!=0){
					return (totalCedulas-1);
				}
			}
			return totalCedulas;
			
		}else{
			if(valorMaximoCedulas%2 != 0){
				return (maxCedulas-1);
			}
			return maxCedulas;
		}
		
	}

	public Montante retiraMontante(int valor) {
		if (validaRetirada(valor)) {
			Montante montanteRetirada = new Montante();
			
			for(EnumCedulas e : EnumCedulas.values()){
				int totalCedulas = this.geraNumeroCedulas(valor, e, cedulas.get(e));
				
				montanteRetirada.setQuantidadeCedulas(e, totalCedulas);
				
				valor-=(e.getValorNota()*totalCedulas);
			}
			this.reduzMontante(montanteRetirada);
			return montanteRetirada;
		} else {
			return null;
		}
	}
}
