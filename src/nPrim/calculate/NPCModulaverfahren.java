package nPrim.calculate;


public class NPCModulaverfahren implements InPrimCalculate {

	public int berechnePrimzahl(int nStelle) {

		int counter = 1;
		int zahl = 3;
		int nPrimzahl = -1;
		
		if(nStelle == 1) {
			return 2;
		} 
		
		else {
			for( int i = zahl; counter != nStelle; i += 2 ) {
				if(isPrime(i)) {
					counter++;
					nPrimzahl = i;
				}
			}
			return nPrimzahl;
		}
	}

	private boolean isPrime(int number) {
		
		if(number%2 == 0) {
			return false;
		} else {
			 for (int i = 3; i < number; ++i) { 
		       if (number % i == 0) 
		         return false; 
		     }
			 return true;
		}
	}
	
	

}
