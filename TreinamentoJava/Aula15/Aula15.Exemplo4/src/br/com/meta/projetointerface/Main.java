package br.com.meta.projetointerface;


import br.com.meta.projetointerface.excecoes.FuncionarioException;
import br.com.meta.projetointerface.menu.Menu;

public class Main {

	public static void main(String[] args) {
        try {
			new Menu().run();
		} catch (FuncionarioException e) {
			e.printStackTrace();
		}
	}

}
