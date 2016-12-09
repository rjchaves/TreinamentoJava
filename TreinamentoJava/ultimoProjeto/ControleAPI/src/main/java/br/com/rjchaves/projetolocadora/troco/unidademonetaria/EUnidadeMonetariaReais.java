package br.com.rjchaves.projetolocadora.troco.unidademonetaria;

public enum EUnidadeMonetariaReais implements IUnidadeMonetaria {
	CEM(100, "Cem", EFormatoFisicoUnidadeMonetaria.CEDULA, ETipoUnidadeMonetaria.REAL), CINQUENTA(50, "Cinquenta",
			EFormatoFisicoUnidadeMonetaria.CEDULA, ETipoUnidadeMonetaria.REAL), VINTE(20, "Vinte",
					EFormatoFisicoUnidadeMonetaria.CEDULA, ETipoUnidadeMonetaria.REAL), DEZ(10, "Dez",
							EFormatoFisicoUnidadeMonetaria.CEDULA, ETipoUnidadeMonetaria.REAL), CINCO(5, "Cinco",
									EFormatoFisicoUnidadeMonetaria.CEDULA, ETipoUnidadeMonetaria.REAL), DOIS(2, "Dois",
											EFormatoFisicoUnidadeMonetaria.CEDULA, ETipoUnidadeMonetaria.REAL), UM(1,
													"Um", EFormatoFisicoUnidadeMonetaria.MOEDA,
													ETipoUnidadeMonetaria.REAL);

	private int valorUnidadeMonetaria;
	private String nome;
	private ETipoUnidadeMonetaria tipoUnidadeMonetaria;
	private EFormatoFisicoUnidadeMonetaria formatoUnidadeMonetaria;

	private EUnidadeMonetariaReais(int valor, String nome, EFormatoFisicoUnidadeMonetaria formatoUnidadeMonetaria,
			ETipoUnidadeMonetaria tipoUnidadeMonetaria) {

		this.valorUnidadeMonetaria = valor;
		this.nome = nome;
		this.formatoUnidadeMonetaria = formatoUnidadeMonetaria;
		this.tipoUnidadeMonetaria = tipoUnidadeMonetaria;

	}

	@Override
	public int getValorUnidadeMonetaria() {
		return valorUnidadeMonetaria;
	}

	@Override
	public String getNomeUnidadeMonetaria() {
		return nome;
	}

	@Override
	public ETipoUnidadeMonetaria getTipoUnidadeMonetaria() {
		return tipoUnidadeMonetaria;
	}

	@Override
	public EFormatoFisicoUnidadeMonetaria getFormatoFisicoUnidadeMonetaria() {
		return formatoUnidadeMonetaria;
	}

	
	public static EUnidadeMonetariaReais getMaiorUnidadeImparPossivel(int valorMaximo) {
		EUnidadeMonetariaReais maiorUnidadeMonetariaImpar = null;
		for (EUnidadeMonetariaReais u : EUnidadeMonetariaReais.values()) {
			if (u.getValorUnidadeMonetaria() % 2 != 0) {
				if (u.getValorUnidadeMonetaria() <= valorMaximo) {
					if (maiorUnidadeMonetariaImpar == null) {
						maiorUnidadeMonetariaImpar = u;
					} else {
						if (u.getValorUnidadeMonetaria() > maiorUnidadeMonetariaImpar.getValorUnidadeMonetaria()) {
							maiorUnidadeMonetariaImpar = u;
						}
					}
				}
			}
		}
		return maiorUnidadeMonetariaImpar;
	}

}
