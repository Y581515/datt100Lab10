package no.hvl.dat100.oppgave5;

public class Simulering {

	private static int[] kast;
	private int[] antallOyne;
	Terning terning;
	private int sum;
	private static int antallKast = 100;

	public Simulering() {
		this(antallKast);
	}

	public int getSum() {
		return sum;
	}

	public void gSKast() {
		double gs = (double) sum / antallKast;
		System.out.println("Gjennomsnittskast : " + gs);
	}

	public Simulering(int antall) {
		kast = new int[antall];
		terning = new Terning();
	}

	public void thrillSimulering() {
		sum = 0;
		for (int i = 0; i < kast.length; i++) {

			terning.trill();
			kast[i] = terning.getOyne();
			sum += kast[i];

		}
	}

	public int[] getKastTab() {
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

	public void AntOyne() {
		int[] tab = sortertKast();
		// System.out.print("[");
		for (int j = 1; j < tab.length; j++) {
			if (j < tab.length - 1) {
				System.out.println("antall " + j + "ere = " + tab[j] + " ");
			} else {
				System.out.print("antall " + j + "ere = " + tab[j]);
			}

		} // System.out.println("]\n");
	}

	public void SkriveUtTegning() {
		int tabIndekst = 0;
		for (int j = 0; j < 5; j++) {
			int i = 0;
			while (i < 20) {
				int n = kast[tabIndekst];
				if (n == 1) {
					System.out.print(String.format("%10s", "[ . ]"));
				}
				if (n == 2) {
					System.out.print(String.format("%10s", "[ : ]"));
				}
				if (n == 3) {
					System.out.print(String.format("%10s", "[...]"));
				}
				if (n == 4) {
					System.out.print(String.format("%10s", "[: :]"));
				}
				if (n == 5) {
					System.out.print(String.format("%10s", "[:.:]"));
				}
				if (n == 6) {
					System.out.print(String.format("%10s", "[:::]"));
				}

				tabIndekst++;
				i++;
			}
			System.out.println("\n");
		}
	}

	public void AntOyneTegning() {
		int[] tab = sortertKast();
		String t = "";
		// System.out.print("[");
		for (int j = 1; j < tab.length; j++) {

			if (j == 1) {
				t = "[ . ]";
			}
			if (j == 2) {
				t = "[ : ]";
			}
			if (j == 3) {
				t = "[...]";
			}
			if (j == 4) {
				t = "[: :]";
			}
			if (j == 5) {
				t = "[:.:]";
			}
			if (j == 6) {
				t = "[:::]";
			}

			System.out.println("antall " + t + "-ere = " + tab[j] + " ");

		} // System.out.println("]\n");
	}

	public int førsteTall(int tall) {
		int pos = 0;
		boolean funnet = false;
		while (pos < kast.length && !(funnet))
			if (tall == kast[pos]) {
				funnet = true;
			} else {
				pos++;
			}

		return pos + 1;
	}

	public void flestResulat() {
		int j = 0;
		int[] tab = sortertKast();
		for (int i = 0; i < tab.length; i++) {
			if (tab[j] < tab[i]) {
				j =i;
			}else {
				
			}
		}

		System.out.println("Terningverdien det var flest av : " + j);

	}

}
