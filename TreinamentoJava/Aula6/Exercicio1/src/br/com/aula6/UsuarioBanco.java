package br.com.aula6;

import java.util.Scanner;

public class UsuarioBanco {
	private String senha = "123mudar";
	private Caixa caixa;
	
	public UsuarioBanco(Caixa caixa){
		this.caixa = caixa;
	}
	
	public boolean autenticar(){
		
		System.out.println("Digite a senha");
		Scanner in  = new Scanner(System.in);
		String senha = in.nextLine();
		
		
		
		if (this.senha.equals(senha)){
			menuUsuarioBanco();
			return true;
		}else{
			return false;
		}
		
	}
	
	private void menuUsuarioBanco(){
		int entrada;
		do{
			System.out.println("Digite o numero correspondente a opção desejada");
			System.out.println("1) Vizualizar caixa");
			System.out.println("2) Repor caixa");
			System.out.println("0) Sair");
			Scanner in  = new Scanner(System.in);
			entrada=in.nextInt();
			
			
			switch(entrada){
			case 1:
				vizualizarCaixa();
				break;
			case 2:
				reposicao();
				break;
			case 0:
				break;
			default:
				System.out.println("Entrada inválida");
				break;
			}
			
		}while(entrada!=0);
	}
	
	private void vizualizarCaixa(){
		Montante montanteCaixa=this.caixa.getMontante();
		System.out.println("Total do caixa: " + montanteCaixa.getTotalMontante());
		System.out.println("Notas disponíveis");
		Impressao.imprimirCedulasMontante(montanteCaixa);
	}
	
	private void reposicao(){
		
		Montante montante = new Montante();
		Scanner in  = new Scanner(System.in);
		System.out.println("Informe as quantidades de notas para reposição");
		
		for(EnumCedulas e : EnumCedulas.values()){
			System.out.println("Quantas notas de "+e.getValorNota()+"?");
			montante.adicionaCedulas(e, in.nextInt());
		}
		this.caixa.adicionarMontante(montante);
		System.out.println("Montante adicionado");
	}
}
