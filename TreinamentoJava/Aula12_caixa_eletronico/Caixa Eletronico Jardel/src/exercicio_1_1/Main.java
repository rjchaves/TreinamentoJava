package exercicio_1_1;

import br.com.rjchaves.banco.SistemaBanco;
import exercicio_1_1.tela.Tela;

public class Main {

	public static void main(String[] args) 
	{
		new Tela(new SistemaBanco()).run();
	}
}
