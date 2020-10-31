package no.hvl.dat100.oppgave5;

import java.util.Random;

public class Terning {

	// aktuell verdi for terningen
		private int oyne;
		private Random random;

		public Terning() {
			this.oyne=0;
			random=new Random();
		}

		public int getOyne() {
		return oyne;
		}

		public void trill() {
			oyne=random.nextInt(6)+1;
			
		}
	
}