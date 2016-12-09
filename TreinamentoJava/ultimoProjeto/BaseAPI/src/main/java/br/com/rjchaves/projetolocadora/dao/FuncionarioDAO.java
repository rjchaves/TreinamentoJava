package br.com.rjchaves.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.rjchaves.projetolocadora.modelo.Funcionario;
import br.com.rjchaves.projetolocadora.util.PesquisaBean;

public class FuncionarioDAO extends GenericoDAO<Funcionario, Integer> {

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Funcionario o = (Funcionario) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

}
