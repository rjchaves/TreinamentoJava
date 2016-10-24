package br.com.aula3.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String[] args){
		String ch;
		Scanner in = new Scanner(System.in);
		ArrayList<Mercadoria> mercadorias = new ArrayList<>();
		
		do{
			Mercadoria novaMerc =  new Mercadoria();
			
			System.out.println("Nome");
			novaMerc.setNome(in.nextLine());
			
			System.out.println("Preço de compra");
			novaMerc.setPrecoCompra(in.nextFloat());
			
			System.out.println("Preço de venda");
			novaMerc.setPrecoVenda(in.nextFloat());
			
			mercadorias.add(novaMerc);
			
			//Leitura para limpar o buffer de entrada
			in.nextLine();
			
			System.out.println("Inserir mais Mercadorias? S/N");
			ch = in.nextLine();
			
		}while(ch.charAt(0)=='S' || ch.charAt(0)=='s');
		in.close();
		
		
		int contMenor10 = 0;
		int contMaior10Menor20 = 0;
		int contMaior20 = 0;
		
		for(Mercadoria m : mercadorias){
			if(m.lucro()<10){
				contMenor10++;
			}else if(m.lucro()>=10 && m.lucro()<=20){
				contMaior10Menor20++;
			}else{
				contMaior20++;
			}
		}
		
		System.out.println("Produtos com lucro menor que 10: "+ contMenor10);
		System.out.println("Produtos com lucro maior que 10 e menor que 20: "+ contMaior10Menor20);
		System.out.println("Produtos com lucro maior que 20: "+ contMaior20);
	}
}
