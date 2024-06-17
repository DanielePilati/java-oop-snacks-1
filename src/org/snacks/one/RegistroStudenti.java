package org.snacks.one;

public class RegistroStudenti {

	private Studente[] studenti;
	
	public RegistroStudenti() {
		this.studenti = new Studente[0];
	}
	
	public Studente[] getStudenti() {
		return studenti;
	}

	public void addStudente(Studente nuovoStudente) {
		Studente[] newStudente = new Studente[this.studenti.length + 1];
		for (int i=0;i<this.studenti.length;i++) {
			newStudente[i] = studenti[i];
		} 
		newStudente[newStudente.length -1] = nuovoStudente;
		this.studenti = newStudente;
	}
	
	public void studentsList() {
		for (Studente studente : studenti) {
			System.out.println(studente.description());
		}
	}
	
	public static void main(String[] args) {
	
		RegistroStudenti registro = new RegistroStudenti();
		registro.addStudente(new Studente("mario","virgulini",25));
		registro.addStudente(new Studente("gina","ginetti",25));
		registro.studentsList();
		
	
	}

}
