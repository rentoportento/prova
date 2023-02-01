package it.renato.esempi;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;
	private String[] parolacce = {"acciderbolina", "poffarbacco", "stupidino"};
	
	public Persona() {
		
	}

	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		
		if(checkParolaccia(nome)) {
			System.out.println("Non puoi settare il nome con una parolaccia");
		} else {
			this.nome = nome;
		}
		
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		if(checkParolaccia(cognome)) {
			System.out.println("Non puoi settare il nome con una parolaccia");
		} else {
			this.cognome = cognome;
		}
	}
	
	private boolean checkParolaccia(String parola) {
		for(int i = 0; i < this.parolacce.length; i++) {
			if(parola == parolacce[i]) {
				return true;
			}
		}
		return false;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		if(eta > 120) {
			System.out.println("Eta non valida");
		} else {
			this.eta = eta;
		}
	}
	
}
