package nPrim.tui;

import java.util.Scanner;

public class Tui {
	
	Scanner scanner; 
	int nteStelle;
	
	public Tui() {
		scanner = new Scanner(System.in);
	}
	
	public void instruction() {
		System.out.println("N-ter Primzahlen Rechner\n");
		System.out.println("Die wievielte Primzahl moechten Sie wissen?");
		System.out.println("\t (vert�gliches limit 10000)");
	}
	
	public int input() {
		System.out.print("Eingabe: ");
		nteStelle = Integer.parseInt(scanner.next());
		if(nteStelle >= 1) {
			return nteStelle;
		} else {
			System.out.println("Falsche Eingabe");
			return -1;
		}
	}
	
	public void output(int nStelle, int primzahl) {
		if(primzahl != -1) {
			System.out.println("\nDie " + nStelle + "-te Primzahl ist: " + primzahl);
		} else {
			System.out.println("\nSorry, \ndie " + nStelle + "-te Primzahl kann nicht berechnet werden.");
		}
		System.out.println("\n---------------------------------------------------- \n");
	}

	public boolean weiter() {
		System.out.print("Weitere Primzahlen berechnen ? (ja = j | nein = n ) : ");
		if(scanner.next().equalsIgnoreCase("j")) {
			System.out.println("\n---------------------------------------------------- \n");
			return true;
		} else {
			System.out.println("\n---------------------------------------------------- \n");
			System.out.println("Programm Beendet");
			return false;
		}
	}

}
