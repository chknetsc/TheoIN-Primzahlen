package nPrim.application;

import nPrim.calculate.InPrimCalculate;
import nPrim.calculate.NPCArrayverfahren;
import nPrim.calculate.NPCModulaverfahren;
import nPrim.tui.Tui;

@SuppressWarnings("unused")
public class NPrimApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int nStelle;
		
		
		InPrimCalculate primCalc = 
				new NPCModulaverfahren();
				//new NPCArrayverfahren();
		Tui tui = new Tui();
		
		
		do {
			tui.instruction();
			nStelle = tui.input();
		
			if(nStelle != -1) {
				int primzahl = primCalc.berechnePrimzahl(nStelle);
				tui.output(nStelle, primzahl);
			}
		} while(tui.weiter());
	}
	
	

}
