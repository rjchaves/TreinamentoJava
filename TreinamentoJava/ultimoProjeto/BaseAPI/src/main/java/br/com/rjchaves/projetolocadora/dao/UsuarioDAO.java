package br.com.rjchaves.projetolocadora.dao;

import org.hibernate.Criteria;

import br.com.rjchaves.projetolocadora.modelo.Usuario;
import br.com.rjchaves.projetolocadora.util.PesquisaBean;

public class UsuarioDAO extends GenericoDAO<Usuario, Integer> {

	@Override
	protected void setAtributoPesq(Criteria crit, PesquisaBean pesquisaBean) throws Exception {
		Usuario o = (Usuario) pesquisaBean.getEntidade();
		
		if(o == null){
			return;
		}
	}

	
	
}
