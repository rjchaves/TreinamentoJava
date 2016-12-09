package br.com.rjchaves.projetolocadora.troco.unidademonetaria;

public enum EUnidadeMonetariaCentavos implements IUnidadeMonetaria {
	CINQUENTA(50, "Cinquenta", EFormatoFisicoUnidadeMonetaria.MOEDA, ETipoUnidadeMonetaria.CENTAVO), VINTECINCO(25,
			"Vinte e Cinco", EFormatoFisicoUnidadeMonetaria.MOEDA, ETipoUnidadeMonetaria.CENTAVO), DEZ(10, "Dez",
					EFormatoFisicoUnidadeMonetaria.MOEDA, ETipoUnidadeMonetaria.CENTAVO), CINCO(5, "Cinco",
							EFormatoFisicoUnidadeMonetaria.MOEDA, ETipoUnidadeMonetaria.CENTAVO), UM(1, "Um",
									EFormatoFisicoUnidadeMonetaria.MOEDA, ETipoUnidadeMonetaria.CENTAVO);

	private int valorUnidadeMonetaria;
	private String nome;
	private ETipoUnidadeMonetaria tipoUnidadeMonetaria;
	private EFormatoFisicoUnidadeMonetaria formatoUnidadeMonetaria;

	private EUnidadeMonetariaCentavos(int valor, String nome, EFormatoFisicoUnidadeMonetaria formatoUnidadeMonetaria,
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

	
	public static EUnidadeMonetariaCentavos getMaiorUnidadeImparPossivel(int valorMaximo) {
		EUnidadeMonetariaCentavos maiorUnidadeMonetariaImpar = null;
		for (EUnidadeMonetariaCentavos u : EUnidadeMonetariaCentavos.values()) {
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
