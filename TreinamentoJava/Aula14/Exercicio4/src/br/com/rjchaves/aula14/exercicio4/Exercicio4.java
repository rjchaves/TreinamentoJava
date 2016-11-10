package br.com.rjchaves.aula14.exercicio4;

public class Exercicio4 {
	public static void main(String[] args) {
		try{
			GeradorVetor.gerar(-1);
		}catch(NegativeArraySizeException e){
			System.out.println("Array não pode ser negativo");
			e.printStackTrace();
		}
	}
}
