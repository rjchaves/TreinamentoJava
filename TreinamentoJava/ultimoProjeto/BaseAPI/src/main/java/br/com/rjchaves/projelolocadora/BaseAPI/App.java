package br.com.rjchaves.projelolocadora.BaseAPI;

import java.util.Calendar;

import br.com.rjchaves.projetolocadora.dao.CategoriaDAO;
import br.com.rjchaves.projetolocadora.dao.FilmeDAO;
import br.com.rjchaves.projetolocadora.modelo.Categoria;
import br.com.rjchaves.projetolocadora.modelo.Filme;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			String categoria =  new CategoriaDAO().pesqPorId(1).getDescricao();
			System.out.println(categoria);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
    
    public Categoria criarCategoria() throws Exception{
    	Categoria categoria = new Categoria();
    	categoria.setDescricao("Terror");
    	
    	new CategoriaDAO().criar(categoria);
    	
    	return categoria;		
    }
    
    public void criarFilme(Categoria categoria) throws Exception {
    	
    	Filme filme = new Filme();
    	FilmeDAO dao = new FilmeDAO();
    	
    	filme.setDescricao("Smurfs");
    	filme.setAno(Calendar.getInstance());
    	filme.setResumo("Todos alegres");
    	filme.setClassificao(8);
    	
    	Calendar duracao = Calendar.getInstance();
    	
    	duracao.set(Calendar.HOUR, 2);
    	duracao.set(Calendar.MINUTE, 0);
    	filme.setDuracao(duracao);
    	
    	dao.criar(filme);    	
    }
}
