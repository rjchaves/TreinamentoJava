package br.com.rjchaves.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.rjchaves.projetolocadora.modelo.Locacao;
import br.com.rjchaves.projetolocadora.util.PesquisaBean;

public class LocacaoDAO extends GenericoDAO<Locacao, Integer> {

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Locacao o = (Locacao) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

}
