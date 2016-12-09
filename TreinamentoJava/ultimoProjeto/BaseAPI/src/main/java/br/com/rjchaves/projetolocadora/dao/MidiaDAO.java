package br.com.rjchaves.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.rjchaves.projetolocadora.modelo.Midia;
import br.com.rjchaves.projetolocadora.util.PesquisaBean;

public class MidiaDAO extends GenericoDAO<Midia, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Midia o = (Midia) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

}
