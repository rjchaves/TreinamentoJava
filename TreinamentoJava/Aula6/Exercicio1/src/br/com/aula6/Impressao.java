package br.com.aula6;


public class Impressao {

	public static void imprimirCedulasMontante(Montante montante) {
		for(EnumCedulas e : EnumCedulas.values()){
			int quantidadeCedulas = montante.getCedulas().get(e);
			System.out.println(quantidadeCedulas + " Notas de " + e.getValorNota());
		}
	}

	public static void imprimirCedulasDisponiveis(Montante montante) {
		boolean primeiraCedula = true;
		for(EnumCedulas e : EnumCedulas.values()){
			int quantidadeCedulas = montante.getCedulas().get(e);
			if(quantidadeCedulas>0){
				if(!primeiraCedula){
					System.out.print("-");
				}else{
					primeiraCedula=false;
				}
				System.out.print(e.getValorNota());
			}
		}
		System.out.println("");
	}
}
