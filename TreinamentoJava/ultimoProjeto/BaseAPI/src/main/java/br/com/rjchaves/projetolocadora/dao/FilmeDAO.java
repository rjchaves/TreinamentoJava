package br.com.rjchaves.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.rjchaves.projetolocadora.modelo.Filme;
import br.com.rjchaves.projetolocadora.util.PesquisaBean;

public class FilmeDAO extends GenericoDAO<Filme, Integer> {

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Filme o = (Filme) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}
}
