package br.com.rjchaves.projetolocadora.dto;



public class FilmeDTO extends BaseDTO{

	private Integer id;

	private String descricao;
	
	private String ano;
	
	private String resumo;
	
	private Integer classificacao;
	
	private String duracao;
	
	private CategoriaDTO categoriaDTO;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificao) {
		this.classificacao = classificao;
	}

	
	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public void setCategoriaDTO(CategoriaDTO categoriaDTO) {
		this.categoriaDTO = categoriaDTO;
	}

	public CategoriaDTO getCategoriaDTO() {
		return categoriaDTO;
	}

	public void setCategoria(CategoriaDTO categoriaDTO) {
		this.categoriaDTO = categoriaDTO;
	}
}
