package br.com.aula5.exercicio9;

public class Letra {
	public static String letra(char c){
		if(Letra.ehVogal(c)){
			return "vogal";
		}else if(Letra.ehConsoante(c)){
			return "consoante";
		}else{
			return "Não é letra";
		}
	}
	
	public static String letra(int c){
		if(Letra.ehVogal(c)){
			return "vogal";
		}else if(Letra.ehConsoante(c)){
			return "consoante";
		}else{
			return "Não é letra";
		}
			
	}
	
	public static boolean ehVogal(char c){
		if(c=='a'||
				c=='A'||
				c=='e'||
				c=='E'||
				c=='i'||
				c=='I'||
				c=='o'||
				c=='O'||
				c=='u'||
				c=='U'){
			return true;
		}else
			return false;
	}
	
	public static boolean ehVogal(int c){
		return Letra.ehVogal(c);
	}
	
	public static boolean ehConsoante(char c){
		if(!Letra.ehVogal(c) && c>='A' && c<='z')
			return true;
		else
			return false;
	}
	
	public static boolean ehConsoante(int c){
		if(!Letra.ehVogal(c) && c>='A' && c<='z')
			return true;
		else
			return false;
	}
	
	
}
