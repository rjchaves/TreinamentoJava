package br.com.rjchaves.banco.extrato.operacoes;

public enum StatusOperacao {
	AGUARDANDO("Aguardando aprovação"),
	APROVADO("Aprovada"),
	REJEITADA("Recusada");
	
	private String texto;
	
	private StatusOperacao(String texto){
		this.texto = texto;
	}
	
	public String getTexto(){
		return texto;
	}
}
