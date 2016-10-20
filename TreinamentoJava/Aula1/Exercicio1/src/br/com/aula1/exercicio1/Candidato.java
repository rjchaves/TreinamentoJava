package br.com.aula1.exercicio1;

public class Candidato {
	int codigo;
	int anoNascimento;
	float primeiraNota;
	int horasQualificação;
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
	public void setHorasQualificação(int horasQualificação) {
		this.horasQualificação = horasQualificação;
	}
	public void setMesesExperiencia(int mesesExperiencia) {
		this.mesesExperiencia = mesesExperiencia;
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	//A função não é totalmente precisa, usando só por ser um exercício
	public int getIdade(){
		return Util.getAnoAtual()-this.anoNascimento;
	}
	
	public boolean verificarAprovacao(){
		return (this.primeiraNota>=8 || this.mesesExperiencia>=24 || this.getIdade()<=30 || this.horasQualificação >=1000);
	}
}
