package org.snacks.one;

public class Studente {
	
	
		private String nome;
		private String cognome;
		private int eta;

		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCognome() {
			return cognome;
		}
		public void setCognome(String cognome) {
			this.cognome = cognome;
		}
		public int getEta() {
			return eta;
		}
		public void setEta(int eta) {
			this.eta = eta;
		}
		
		Studente(String nome,String cognome,int eta){
			this.nome = nome;
			this.cognome = cognome;
			this.eta = eta;
		}
		public String description () {
			return this.nome + " " + this.cognome + ", " + this.eta + " anni";
		}
		
		
		
		
	public static void main(String[] args) {
		
		Studente studente = new Studente("Anselmo","Bitta",24);
		System.out.println(studente.description());

	}

}
