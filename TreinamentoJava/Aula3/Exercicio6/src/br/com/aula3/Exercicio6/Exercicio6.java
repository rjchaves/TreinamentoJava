package br.com.aula3.Exercicio6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int resp;
		Cursos cursos = new Cursos();
		do {
			Curso novoCurso = new Curso();
			
			System.out.println("Digite os dados do curso");
			System.out.println("Código");
			novoCurso.setId(in.nextInt());
			System.out.println("Numero de vagas");
			novoCurso.setNumeroVagas(in.nextInt());
			
			System.out.println("Numero de candidatos do sexo masculino");
			novoCurso.setNumCandidatosMasc(in.nextInt());
			
			System.out.println("Numero de candidatos do sexo feminino");
			novoCurso.setNumCanditatosFem(in.nextInt());
			
			cursos.addCurso(novoCurso);
			
			//Limpar o buffer
			in.nextLine();
			
			System.out.println("Digite -1 para sair ou qualquer outra tecla para continuar");
			try{
				resp = in.nextInt();
			}catch(Exception e){
				e.printStackTrace();
				resp = 1;
			}
			
		} while (resp != -1);
		in.close();
		
		cursos.printCursos();
	}
}
