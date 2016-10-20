package br.com.aula1.exercicio2;

public class Compra {
	
	float litrosGasolina;
	float litrosAlcool;
	
	
	public void setLitrosGasolina(float litrosGasolina) {
		this.litrosGasolina = litrosGasolina;
	}

	public void setLitrosAlcool(float litrosAlcool) {
		this.litrosAlcool = litrosAlcool;
	}
	

	private float getValorGasolina(){
		return litrosGasolina*Precos.getPrecoGasolina();
	}
	
	private float getValorAlcool(){
		if(litrosAlcool <= 10){
			return (litrosAlcool*Precos.getPrecoAlcool());
		}else{
			return (litrosAlcool*Precos.getPrecoAlcoolPromocional());
		}
	}
	
	public float getValorCompra(){
		float valorCompra = this.getValorGasolina()+this.getValorAlcool();
		float totalLitrosCompra = litrosAlcool + litrosGasolina;
		
		if(valorCompra > 70 || totalLitrosCompra>20){
			valorCompra*=0.9;
		}
		return valorCompra;
	}
	
}
