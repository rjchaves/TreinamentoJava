package br.com.rjchaves.banco.contas;

import java.util.ArrayList;

public class Contas {
	private ArrayList<Conta> contas;
	public Contas(){
		contas = new ArrayList<>();
		contas.add(new Conta(100, 1, "123birosca"));
		contas.get(0).adicionarMontanteAConta(1500);
		contas.add(new Conta(100, 2, "123birosca"));
		contas.add(new Conta(100, 3, "123birosca"));
		contas.add(new Conta(100, 4, "123birosca"));
	}
	
	public Conta autenticar(Conta conta){
		for(Conta c :  contas){
			if(c.conferirDadosConta(conta)){
				return c;
			}
		}
		return null;
	}
}
