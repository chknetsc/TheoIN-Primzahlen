package nPrim.application;

import utilitys.StopWatch;
import nPrim.calculate.InPrimCalculate;
import nPrim.calculate.NPCModulaverfahren;
import nPrim.tui.Tui;

public class NPrimApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nStelle;
		StopWatch timer = new StopWatch();
		
		// Berechungsverfahren
		InPrimCalculate primCalc = new NPCModulaverfahren();
							  // = new NPCArrayverfahren();
		
		Tui tui = new Tui();
		
		
		do {
			tui.instruction();
			nStelle = tui.input();
		
			if(nStelle != -1) {
				
				timer.start();
				int primzahl = primCalc.berechnePrimzahl(nStelle);
				tui.output(nStelle, primzahl, timer.getElapsedTimeSecs());
			}
		} while(tui.weiter());
	}
	
	

}
