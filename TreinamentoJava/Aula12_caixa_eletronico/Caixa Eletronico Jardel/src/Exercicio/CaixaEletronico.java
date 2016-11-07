package Exercicio;

import java.util.ArrayList;

import exercicio_1_1.caixa.Cedulas;

public class CaixaEletronico 
{
	private String senhaV = "@dm.c@ixa"; //Senha inicial
	private ArrayList<Cedulas> dscrCedula;
	
	//public CaixaEletronico(String Senha)
	//{
	//	this.senhaV = Senha;
	//}
	
	public CaixaEletronico()
	{
		dscrCedula = new ArrayList<>();
	}
	
	//-------------------------------------------------------------//

	public void criarLista()
	{
		dscrCedula.add(new Cedulas("Cinquenta", 50, 30));
		dscrCedula.add(new Cedulas("Vinte", 20, 20));
		dscrCedula.add(new Cedulas("Dez", 10, 40));
		dscrCedula.add(new Cedulas("Cinco", 5, 50));
		dscrCedula.add(new Cedulas("Dois", 2, 40));
	}
	
	public boolean validacaoSenha(String senha)
	{
		if(senha == senhaV)
			return true;
		else
			return false;
	}
	
	public String valorTotal()
	{
		String texto = "";
		int total = 0;
		
		for(Cedulas cedulas: dscrCedula)
		{
			texto = (texto+""+cedulas.getNomeNota()+" > "+cedulas.getQntNotas()+"\n");
			total = total + (cedulas.getQntNotas() * cedulas.getValorNota());
		}
		texto = (texto+"\nValor total: R$ "+total+",00");
		
		return texto;
	}
	
	public void adicionarCedulas(int valor, int quantidade)
	{
		
		for(Cedulas cedulas: dscrCedula)
		{
			if(valor == cedulas.getValorNota()); // retirar ;
				//cedulas.getQntNotas() = cedulas.getQntNotas() + quantidade;
			
		}
	}
	
}
