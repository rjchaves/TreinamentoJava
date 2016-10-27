package br.com.aula6.banco;

public enum EnumCedulas {
	CEM(100), CINQUENTA(50), VINTE(20), DEZ(10), CINCO(5), DOIS(2);

	private final int id;

	EnumCedulas(int id) { 
		this.id = id; 
	}

	public int getValorNota() {
		return id;
	}
}
