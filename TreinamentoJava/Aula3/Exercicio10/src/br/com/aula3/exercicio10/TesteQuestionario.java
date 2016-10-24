package br.com.aula3.exercicio10;

public class TesteQuestionario {
	private boolean leao = true;
	private boolean cavalo = true;
	private boolean homem = true;
	private boolean macaco = true;
	private boolean avestruz = true;
	private boolean pinguim = true;
	private boolean pato = true;
	private boolean aguia = true;
	private boolean tartaruga = true;
	private boolean crocodilo = true;
	private boolean cobra = true;

	public boolean ehMamifero(String resp) {
		if (resp.equalsIgnoreCase("sim")) {
			this.avestruz = false;
			this.pinguim = false;
			this.pato = false;
			this.aguia = false;
			this.tartaruga = false;
			this.crocodilo = false;
			this.cobra = false;
			return true;
		} else {
			this.leao = false;
			this.cavalo = false;
			this.homem = false;
			this.macaco = false;
			return false;
		}
	}

	public boolean ehAve(String resp) {
		if (resp.equalsIgnoreCase("sim")) {
			this.tartaruga = false;
			this.crocodilo = false;
			this.cobra = false;
			this.leao = false;
			this.cavalo = false;
			this.homem = false;
			this.macaco = false;
			return true;
		} else {
			this.avestruz = false;
			this.pinguim = false;
			this.aguia = false;
			this.pato = false;
			return false;
		}
	}

	public boolean ehQuadrupede(String resp) {
		if (resp.equalsIgnoreCase("sim")) {
			this.avestruz = false;
			this.pinguim = false;
			this.pato = false;
			this.aguia = false;
			this.cobra = false;
			this.homem = false;
			return true;
		} else {
			this.leao = false;
			this.cavalo = false;
			this.macaco = false;
			this.tartaruga = false;
			this.crocodilo = false;
			return false;
		}
	}

	public boolean ehCarnivoro(String resp) {
		if (resp.equalsIgnoreCase("sim")) {
			this.avestruz = false;
			this.pato = false;
			this.cavalo = false;
			this.macaco = false;
			this.tartaruga = false;
			this.homem = false;
			return true;
		} else {
			this.leao = false;
			this.crocodilo = false;
			this.pinguim = false;
			this.aguia = false;
			this.cobra = false;
			return false;
		}
	}

	public boolean ehHerbivoro(String resp) {
		if (resp.equalsIgnoreCase("sim")) {
			this.leao = false;
			this.crocodilo = false;
			this.pinguim = false;
			this.aguia = false;
			this.cobra = false;
			this.homem = false;
			return true;
		} else {
			this.avestruz = false;
			this.pato = false;
			this.cavalo = false;
			this.macaco = false;
			this.tartaruga = false;
			return false;
		}
	}

	public boolean viveNaAgua(String resp) {
		if (resp.equalsIgnoreCase("sim")) {
			this.leao = false;
			this.aguia = false;
			this.avestruz = false;
			this.cavalo = false;
			this.macaco = false;
			this.homem = false;
			return true;
		} else {
			this.tartaruga = false;
			this.crocodilo = false;
			this.pinguim = false;
			this.pato = false;
			return false;
		}
	}
	
	public boolean viveEmArvores(String resp) {
		if (resp.equalsIgnoreCase("sim")) {
			this.leao = false;
			this.aguia = false;
			this.avestruz = false;
			this.cavalo = false;
			this.tartaruga = false;
			this.crocodilo = false;
			this.pinguim = false;
			this.homem = false;
			return true;
		} else {
			this.macaco = false;
			return false;
		}
	}

	public boolean animalDescoberto() {
		
		int totalTrue = 0;

		if (this.avestruz) {
			totalTrue++;
		}
		if (this.pinguim) {
			totalTrue++;
		}
		if (this.pato) {
			totalTrue++;
		}
		if (this.aguia) {
			totalTrue++;
		}
		if (this.tartaruga) {
			totalTrue++;
		}
		if (this.crocodilo) {
			totalTrue++;
		}
		if (this.cobra) {
			totalTrue++;
		}
		if (this.leao) {
			totalTrue++;
		}
		if (this.cavalo) {
			totalTrue++;
		}
		if (this.homem) {
			totalTrue++;
		}
		if (this.macaco) {
			totalTrue++;
		}
		return (totalTrue == 1);
	}

	public String getAnimalDescoberto() {
		if (!this.animalDescoberto())
			return "";
		else {
			if (this.avestruz) {
				return "avestruz";
			} else if (this.pinguim) {
				return "pinguim";
			} else if (this.pato) {
				return "pato";
			} else if (this.aguia) {
				return "aguia";
			} else if (this.tartaruga) {
				return "tartaruga";
			} else if (this.crocodilo) {
				return "crocodilo";
			} else if (this.cobra) {
				return "cobra";
			} else if (this.leao) {
				return "leao";
			} else if (this.cavalo) {
				return "cavalo";
			} else if (this.homem) {
				return "homem";
			} else {
				return "macaco";
			}
		}

	}

	public void printaPossiveis() {

		if (this.avestruz) {
			System.out.println("avestruz");
		}
		if (this.pinguim) {
			System.out.println("pinguin");
		}
		if (this.pato) {
			System.out.println("pato");
		}
		if (this.aguia) {
			System.out.println("aguia");
		}
		if (this.tartaruga) {
			System.out.println("tartaruga");
		}
		if (this.crocodilo) {
			System.out.println("croco");
		}
		if (this.cobra) {
			System.out.println("cobra");
		}
		if (this.leao) {
			System.out.println("leao");
		}
		if (this.cavalo) {
			System.out.println("cavalo");
		}
		if (this.homem) {
			System.out.println("homi");
		}
		if (this.macaco) {
			System.out.println("macaco");
		}
	}
}
