package br.com.aula2.exercicio5;

import java.util.ArrayList;

public class Exercicio5 {
	public static void main(String[] args){
		//Testes Porta
		System.out.println("Porta");
		Porta porta = new Porta(false, "vermelho");
		porta.abre();
		porta.fecha();
		porta.pinta("Rosa xok");
		porta.setDimensaoX(2);
		porta.setDimensaoY(3);
		porta.setDimensaoZ(1);
		
		System.out.println("Esta aberta: "+ porta.estaAberta());
		System.out.println("Cor: " + porta.getCor());
		System.out.println("Dimensões: " + porta.dimensoes());
		
		
		//Casa
		System.out.println("Casa");
		ArrayList<Porta> portas = new ArrayList<>();
		portas.add(new Porta(true, "Verde"));
		portas.add(new Porta(true, "Verde"));
		portas.add(new Porta(true, "Verde"));
		
		Casa casa =  new Casa("Verde", portas);
		casa.pinta("Azul");
		portas.get(0).fecha();
		portas.get(1).fecha();
		portas.get(2).fecha();
		portas.get(1).abre();
		System.out.println("Portas abertas: " + casa.quantasPortasEstaoAbertas());
		System.out.println("Portas fechadas: " + casa.totalDePortasFechadas());
		
		//Edificio
		System.out.println("Edificio");
		Edificio ed = new Edificio("Rosa", 1);
		ed.pinta("Azul do mar");
		
		ed.adicionaPorta(new Porta(false, "Azul"));
		ed.adicionaPorta(new Porta(false, "Azul"));
		ed.adicionaPorta(new Porta(false, "Azul"));
		ed.adicionaPorta(new Porta(false, "Azul"));
		ed.adicionaPorta(new Porta(false, "Azul"));
		ed.adicionaPorta(new Porta(false, "Azul"));
		
		for(int i=0; i<3; i++){
			ed.adicionarAndar();
		}
		
		System.out.println("Portas abertas: " + ed.quantasPortasEstaoAbertas());
		System.out.println("Total de portas: " + ed.totalDePortas());
		System.out.println("Total de andares: "+ed.totalDeAndares());
		
	}
}
