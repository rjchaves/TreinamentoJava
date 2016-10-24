package br.com.aula3.Exercicio4;

public class Material {
	private float massaInicial;
	private float massaAtual;
	public int segundos;

	public Material(float massa) {
		this.massaInicial = massa;
		this.massaAtual = massa;
		segundos = 0;
	}

	public void decaiMetade() {
		massaAtual /= 2;
		segundos += 50;
	}
	
	public float getMassaInicial() {
		return massaInicial;
	}

	public float getMassaAtual() {
		return massaAtual;
	}

	// Resto da hora e resto dos minutos
	public int getSegundos() {
		return ((segundos % 60) % 60);
	}

	// Resto da hora e resto dos minutos
	public int getMinutos() {
		return (segundos % 60) / 60;
	}

	// Resto da hora e resto dos minutos
	public int getHoras() {
		return segundos/60;
	}
}
