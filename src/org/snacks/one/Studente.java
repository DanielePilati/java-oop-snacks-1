package org.snacks.one;

public class Studente {
	
	
		private String nome;
		private String cognome;
		private int eta;

		Studente(String nome,String cognome,int eta){
			this.nome = nome;
			this.cognome = cognome;
			this.eta = eta;
		}
		public String description () {
			return this.nome + " " + this.cognome + ", " + this.eta;
		}
		
		
		
		
	public static void main(String[] args) {
		
	}

}
