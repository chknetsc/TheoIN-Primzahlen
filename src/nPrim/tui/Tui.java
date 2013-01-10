package nPrim.tui;

import java.util.Scanner;

public class Tui {
	
	Scanner scanner; 
	int nteStelle;
	
	public Tui() {
		scanner = new Scanner(System.in);
	}
	
	public void instruction() {
		System.out.println("N-ter Primzahlen Rechner");
		System.out.println("Die wievielte Primzahl moechten Sie wissen?");
		System.out.println("\t (vertägliches limit 10000)");
	}
	
	public int input() {
		nteStelle = Integer.parseInt(scanner.next());
		if(nteStelle >= 1) {
			return nteStelle;
		} else {
			System.out.println("Falsche Eingabe");
			return -1;
		}
	}
	
	public void output(int primzahl) {
		if(primzahl != -1) {
			System.out.println("Die n-te Primzahl ist: " + primzahl);
		} else {
			System.out.println("Sorry, \ndie n-te Primzahl kann nicht berechnet werden.");
		}
	}

}
