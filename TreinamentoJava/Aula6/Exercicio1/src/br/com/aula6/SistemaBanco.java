package br.com.aula6;

import java.util.Scanner;

import br.com.aula6.Usuario.Cliente;
import br.com.aula6.Usuario.UsuarioBanco;
import br.com.aula6.banco.Caixa;

public class SistemaBanco {
	private Caixa caixa;
	
	public SistemaBanco(){
		this.caixa = new Caixa();
	}
	
	public void run(){
		Scanner in;
		int entrada;
		do{
			System.out.println("Digite o numero correspondente a opção desejada");
			System.out.println("1) Entrar como usuário do banco");
			System.out.println("2) entrar como cliente");
			System.out.println("0) Sair");
			in  = new Scanner(System.in);
			entrada=in.nextInt();
			
			
			switch(entrada){
			case 1:
				new UsuarioBanco(caixa).autenticar();
				break;
			case 2:
				new Cliente(caixa).menuCliente();
				break;
			case 0:
				break;
			default:
				System.out.println("Entrada inválida");
				break;
			}
			
		}while(entrada!=0);
		in.close();
		System.out.println("Bye Bye");
	}
}
