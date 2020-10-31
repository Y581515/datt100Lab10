package no.hvl.dat100.oppgave5;

public class Simulering {

	private static int[] kast;
	private int[] antallOyne;
	Terning terning;

	public Simulering() {
		this(100);
	}

	public Simulering(int antall) {
		kast = new int[antall];
		terning = new Terning();
	}

	public void thrillSimulering() {
		for (int i = 0; i < kast.length; i++) {
			terning.trill();
			kast[i] = terning.getOyne();
		}
	}

	public int[] getKast() {
		return kast;
	}
	

	public int[] sortertKast() {
		antallOyne = new int[7];
		for (int i = 0; i < kast.length; i++) {
			antallOyne[kast[i]]++;
		}
		return antallOyne;
	}

	public void SkriveUt() {
		int tabIndekst = 0;
		for (int j = 0; j < 5; j++) {
			int i = 0;
			while (i < 20) {
				int n = kast[tabIndekst];
				System.out.print(n + "\t");

				tabIndekst++;
				i++;
			}
			System.out.println("\n");
		}
	}

	public void SkriveUt2() {
		int[] tab=sortertKast();
		//System.out.print("[");
		for (int j = 1; j < tab.length; j++) {
			if(j<tab.length-1) {
				System.out.println("antall "+j+"ere = "+tab[j]+ " ");
			}else {
				System.out.print("antall "+j+"ere = "+tab[j]);
			}
				
		}//System.out.println("]\n");
	}
	
}
