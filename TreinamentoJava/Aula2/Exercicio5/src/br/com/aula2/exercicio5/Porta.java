package br.com.aula2.exercicio5;

public class Porta {
	private boolean aberta;
	private String cor;
	private float dimensaoX; 
	private float dimensaoY;
	private float dimensaoZ;
	
	public Porta(boolean aberta, String cor){
		this.aberta = aberta;
		this.cor = cor;
	}
	
	public void abre(){
		this.aberta = true;
	} 
	
	public void fecha(){
		this.aberta=false;
	}
	
	public void pinta(String s){
		this.cor=s;
	} 
	
	public  boolean estaAberta(){
		return aberta;
	}
	

	public String getCor() {
		return cor;
	}
	
	
	public  void setDimensoes(float x, float y, float z){
		this.dimensaoX = x;
		this.dimensaoY = y;
		this.dimensaoZ = z;
	}

	public float getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(float dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public float getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(float dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public float getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(float dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}
	
	public String dimensoes(){
		return "x = " + dimensaoX + " y = " + dimensaoY + " z = " + dimensaoZ;
	}
	
}
