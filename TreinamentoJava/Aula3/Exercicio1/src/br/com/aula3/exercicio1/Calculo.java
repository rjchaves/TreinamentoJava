package br.com.aula3.exercicio1;

public class Calculo {
	private float totalCarrosX = 120;
	private float totalCarrosY = 40;
	private float porcDefeitoX;
	private float porcDefeitoY;

	
	public Calculo(int porcDefeitoX, int porcDefeitoY){
		this.porcDefeitoX = porcDefeitoX;
		this.porcDefeitoY = porcDefeitoY;
	}
	
	public int totalCarrosXDefeito(){
		return (int) (totalCarrosX*(porcDefeitoX/100));
	}
	
	public int totalCarrosYDefeito(){
		return (int) (totalCarrosY*(porcDefeitoY/100));
	}
	
	public float porcentagemTotalDefeitos(){
		float totalCarros = totalCarrosX+totalCarrosY;
		float totalCarrosComDefeito = this.totalCarrosXDefeito()+this.totalCarrosYDefeito();
		return ((100*totalCarrosComDefeito)/totalCarros);
		
	}
	
}
