package exercicio_1_1.tela.util;

public class Util {
	public final static void clearConsole(){
		StringBuilder str = new StringBuilder();
		for(int i=0; i<200; i++){
			str.append("\n");
		}
		System.out.println(str);
    }
}
