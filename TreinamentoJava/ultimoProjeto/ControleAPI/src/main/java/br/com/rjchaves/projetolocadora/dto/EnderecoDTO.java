package br.com.rjchaves.projetolocadora.dto;


public class EnderecoDTO extends BaseDTO {

	private Integer id;
	
	private String rua;
	
	private Integer numero;
	
	
	private String bairro;
	

	private String cidade;
	

	private String estado;
	

	private String cep;
	

	private String complemento;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public boolean verificarEnderecoValido() throws Exception{
		if((this.cidade == null || this.cidade.isEmpty())){
			throw new Exception("Campo cidade não informado");
		}else if (this.cep == null || this.cep.isEmpty()){
			throw new Exception("Campo CEP não informado");
		}else if(this.estado == null || this.estado.isEmpty()){
			throw new Exception("Campo Estado não informado");
		}else if(this.rua == null || this.rua.isEmpty()){
			throw new Exception("Campo rua não informado");
		}
		return true;
	}
}
