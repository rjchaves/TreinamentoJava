package br.com.rjchaves.projetolocadora.dao;

import java.io.Serializable;

import org.hibernate.Criteria;

import br.com.rjchaves.projetolocadora.modelo.Cliente;
import br.com.rjchaves.projetolocadora.util.PesquisaBean;

public class ClienteDAO extends GenericoDAO<Cliente, Integer>{

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Cliente o = (Cliente) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

}
