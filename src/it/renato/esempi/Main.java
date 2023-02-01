package it.renato.esempi;

public class Main {

	public static void main(String[] args) {
		
		int risultato = somma(10, 15);
		
		System.out.println(risultato);
		
		Persona p = new Persona();
		
		p.setNome("Renato");
		
		Persona personaX = p;
		
		System.out.println(personaX.toString());
		System.out.println(p.toString());
		
		personaX.setNome("Gianluca");
		
		System.out.println(personaX.getNome());
		
		System.out.println(p.getNome());

		
		
		Persona p2 = new Persona();
		p2.setNome("Oreste");
		p2.setEta(145);
		//l'età è stata inizializzata a valore di default, che per gli Integer è equivalente a 0
		System.out.println(p2.getEta());
		
		p2.setNome("Marco");
		
		System.out.println(p2.getNome());
		
		
		
		System.out.println(p2.toString());

	}
	
	public static int somma(int a, int b) {
		return a + b;
	}

}
