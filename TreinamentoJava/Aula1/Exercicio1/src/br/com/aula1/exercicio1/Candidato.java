package br.com.aula1.exercicio1;

public class Candidato {
	int codigo;
	int anoNascimento;
	float primeiraNota;
	int horasQualifica��o;
	int mesesExperiencia;
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public void setPrimeiraNota(float primeiraNota) {
		this.primeiraNota = primeiraNota;
	}
	public void setHorasQualifica��o(int horasQualifica��o) {
		this.horasQualifica��o = horasQualifica��o;
	}
	public void setMesesExperiencia(int mesesExperiencia) {
		this.mesesExperiencia = mesesExperiencia;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	//A fun��o n�o � totalmente precisa, usando s� por ser um exerc�cio
	public int getIdade(){
		return Util.getAnoAtual()-this.anoNascimento;
	}
	
	public boolean verificarAprovacao(){
		return (this.primeiraNota>=8 || this.mesesExperiencia>=24 || this.getIdade()<=30 || this.horasQualifica��o >=1000);
	}
}
