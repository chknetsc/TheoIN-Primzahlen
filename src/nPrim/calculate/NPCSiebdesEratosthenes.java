package nPrim.calculate;

public class NPCSiebdesEratosthenes implements InPrimCalculate {

	@Override
	public int berechnePrimzahl(int nStelle) {
		
		int limit = 100;
        int zahl;                                                       // Zu überprüfende Zahl
        int zaehler;                                                    // Durch diese Zahl soll geteilt werden
        int teiler;                                                     // Anzahl der möglichen Teiler
        int rest;        												// Rest bei der Division
        for (zahl = 1; zahl <= limit; zahl++)                           // zahl <= x   ist der zu überprüfende Zahlenraum
        {
                if (zahl == 1)                                          // Ausschluss der Zahl 1 als Primzahl
                        System.out.println("");
                else
                {
                        teiler = 0;
                        for (zaehler = 1; zaehler <= zahl; zaehler++)   // Es empfiehlt sich den Terminationswert auf zahl zu 
                                                                        //setzen und nicht auf limit, da die Berechnung von Primzahlen 
                                                                        //bis zu Milliardenbeträgen sonst nur äußerst langsam 
                                                                        //funktioniert. Die Teilung durch Zahlen, die größer sind als 
                                                                        //die zu überprüfende Zahl selbst ist ohne hin obsolet.

                        {
                                rest = zahl % zaehler;                 // Division der Ausgangszahl durch eine weitere und ablegen des Rests in der Variabel zahl2
                                if (rest == 0)                         // Falls der Rest gleich 0 ist ist ein Teiler gefunden
                                        teiler++;


                        }
                        if (teiler == 2)                                // Wenn die Zahl genau 2 Teiler hat ist sie eine Primzahl
                                System.out.println(zahl+" ist eine Primzahl, da sie genau "+teiler+" Teiler hat");
                        /*else                                          // Andernfalls ist sie keine Primzahl
                                System.out.println(zahl+" ist KEINE Primzahl");*/
                }
        }
        return -1;
	}

}
