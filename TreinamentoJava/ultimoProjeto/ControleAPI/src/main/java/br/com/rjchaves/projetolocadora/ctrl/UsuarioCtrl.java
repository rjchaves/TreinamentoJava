package br.com.rjchaves.projetolocadora.ctrl;

import java.math.BigDecimal;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.rjchaves.projetolocadora.dao.ClienteDAO;
import br.com.rjchaves.projetolocadora.dao.EnderecoDAO;
import br.com.rjchaves.projetolocadora.dao.FuncionarioDAO;
import br.com.rjchaves.projetolocadora.dao.UsuarioDAO;
import br.com.rjchaves.projetolocadora.dto.EnderecoDTO;
import br.com.rjchaves.projetolocadora.dto.FuncionarioDTO;
import br.com.rjchaves.projetolocadora.dto.UsuarioDTO;
import br.com.rjchaves.projetolocadora.modelo.Cliente;
import br.com.rjchaves.projetolocadora.modelo.Endereco;
import br.com.rjchaves.projetolocadora.modelo.Funcionario;
import br.com.rjchaves.projetolocadora.modelo.Usuario;

@Path("/usuario")
public class UsuarioCtrl {
	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cadastrarcliente")
	public UsuarioDTO cadastraUsuario(UsuarioDTO usuarioDTO){
		try {
			validaCamposObrigatorios(usuarioDTO);			
		
		} catch (Exception e) {
			usuarioDTO.setMensagem(e.getMessage());
		}
		
		
		try {
			Usuario usuario = converterUsuarioDTOParaUsuario(usuarioDTO);
			new EnderecoDAO().criar(usuario.getEndereco());
			new UsuarioDAO().criar(usuario);
			usuarioDTO.setId(usuario.getId());
			Cliente cliente = new Cliente();
			cliente.setId((usuario.getId()));
			new ClienteDAO().criar(cliente);
		} catch (Exception e) {
			//mudar mensagem pra não depender de mensagem de outra api
			usuarioDTO.setMensagem(e.getMessage());
		}
		
		return usuarioDTO;
	}
	
	@POST
	@Produces("application/json")
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/cadastrarfuncionario")
	public FuncionarioDTO cadastraFuncionario(FuncionarioDTO funcionarioDTO){
		try {
			validaCamposObrigatorios(funcionarioDTO);			
		
		} catch (Exception e) {
			funcionarioDTO.setMensagem(e.getMessage());
		}
		try {
			Funcionario funcionario = converterFuncionarioDTOemFuncionario(funcionarioDTO);
			new EnderecoDAO().criar(funcionario.getUsuario().getEndereco());
			new UsuarioDAO().criar(funcionario.getUsuario());
			new FuncionarioDAO().criar(funcionario);
			funcionarioDTO.setId(funcionario.getId());
					
		} catch (Exception e) {
			//mudar mensagem pra não depender de mensagem de outra api
			funcionarioDTO.setMensagem(e.getMessage());
		}
		
		return funcionarioDTO;
	}
	
	private void validaCamposObrigatorios(UsuarioDTO usuarioDTO) throws Exception{
		
		if(!validaString(usuarioDTO.getNome()) || !validaString(usuarioDTO.getEmail())){
			throw new Exception("Dados obrigatórios faltantes");
		}
		else if(!validaString(usuarioDTO.getCelular()) && !validaString(usuarioDTO.getTelefone())){
			throw new Exception("Necessário inserir pelo menos um telefone");
		}
		
		usuarioDTO.getEndereco().verificarEnderecoValido();
		
	}
	
	private void validaCamposObrigatorios(FuncionarioDTO funcionarioDTO) throws Exception{
		
		if(!validaString(funcionarioDTO.getLogin()) || 
				!validaString(funcionarioDTO.getSenha()) || 
						funcionarioDTO.getSalario() == null){
			throw new Exception("Dados obrigatórios faltantes");
		}
		
		validaCamposObrigatorios(funcionarioDTO.getUsuario());
	}
	
	private boolean validaString(String str){
		if(str == null || str.isEmpty()){
			return false;
		}
		return true;
	}
	
	public static Usuario converterUsuarioDTOParaUsuario(UsuarioDTO usuarioDTO){
		Usuario usuario = new Usuario();
		usuario.setCelular(usuarioDTO.getCelular());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setEndereco(converterEnderecoDTOParaEndereco(usuarioDTO.getEndereco()));
		usuario.setNome(usuarioDTO.getNome());
		usuario.setTelefone(usuarioDTO.getTelefone());
		return usuario;
	}
	
	public static Endereco converterEnderecoDTOParaEndereco(EnderecoDTO enderecoDTO){
		Endereco endereco = new Endereco();
		endereco.setBairro(enderecoDTO.getBairro());
		endereco.setCep(enderecoDTO.getCep());
		endereco.setCidade(enderecoDTO.getCidade());
		endereco.setComplemento(enderecoDTO.getComplemento());
		endereco.setEstado(enderecoDTO.getEstado());
		endereco.setId(enderecoDTO.getId());
		endereco.setNumero(enderecoDTO.getNumero());
		endereco.setRua(enderecoDTO.getRua());
		return endereco;
	}
	
	public static Funcionario converterFuncionarioDTOemFuncionario(FuncionarioDTO funcionarioDTO){
		Funcionario funcionario = new Funcionario();
		funcionario.setLogin(funcionarioDTO.getLogin());
		funcionario.setSalario(new BigDecimal(funcionarioDTO.getSalario()));
		funcionario.setSenha(funcionarioDTO.getSenha());
		funcionario.setUsuario(converterUsuarioDTOParaUsuario(funcionarioDTO.getUsuario()));
		return funcionario;
	}
}
