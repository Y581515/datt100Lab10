package no.hvl.dat100.oppgave4;

public class MiniExcel {

	private static int[][] data = { { 2, 1, 2, 0 }, { 2, 1, 2, 0 }, { 2, 3, 4, 0 }, { 2, 5, 6, 0 }, { 0, 0, 0, 0 } };

	public static void skrivUt() {

		System.out.println("--------------------");

		for (int r = 0; r < data.length; r++) {

			int[] rad = data[r];

			for (int i = 0; i < rad.length; i++) {
				
				System.out.print(String.format(" %2d |",rad[i]));	
					
			}
			System.out.println("");

		}
		System.out.println("--------------------\n");
	}

	public static void beregnSum() {

		for (int r = 0; r < data.length - 1; r++) {
			int[] rad = data[r];
			int sum = 0;
			int sistepos = rad.length - 1;
			for (int k = 0; k < sistepos; k++) {
				sum = sum + rad[k];
			}
			rad[sistepos] = sum;
		}

		int sisteradpos = data.length - 1;
		int radlengde = data[0].length;
		int[] sisterad = data[sisteradpos];
		for (int k = 0; k < radlengde; k++) {
			int sum = 0;
			for (int r = 0; r < sisteradpos; r++) {
				sum = sum + data[r][k];
			}
			sisterad[k] = sum;
		}

	}

	public static void main(String args[]) {

		skrivUt();

		beregnSum();

		skrivUt();
	}

}