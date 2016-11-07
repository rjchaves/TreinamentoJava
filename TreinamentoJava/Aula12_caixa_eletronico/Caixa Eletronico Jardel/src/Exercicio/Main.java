package Exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		CaixaEletronico caixa = new CaixaEletronico();
		
		int i = 1;
		int entrada = 1;
		int entradaDois = 1;
		
			while(i == 1)
			{
				System.out.println("=-=-=-=-=-= MENU =-=-=-=-=-=\n");
				System.out.println("Escolha uma forma de entrada:\n\t01. Administrador\n\t02. Cliente\nEscolha: ");
				entrada = input.nextInt();
				
				switch(entrada)
				{
				case 1:
					String senha = "@dm.c@ixa";
					System.out.println("Digite sua senha de acesso: ");
					//senha = input.nextLine();
					if(caixa.validacaoSenha(senha))
					{
						System.out.println("=-=-=-=-=-= MENU 2 =-=-=-=-=-=\n");
						System.out.println("Escolha uma das opções:\n\t01. Resposição de notas\n\t02. Visualizar total disponível\nEscolha: ");
						entradaDois = input.nextInt();
						switch(entradaDois)
						{
						case 1:
							System.out.println("");
						break;
						
						case 2:
							System.out.println("Total de cedulas de cada tipo:\n"+caixa.valorTotal());
						break;
						}
					}
					else
					{
						System.out.println("\n\tSenha Incorreta!!!\n");
					}
				break;
				}
			}
	}

}
