package no.hvl.dat100.oppgave5;

public class Tester {

	public static void main(String[] args) {
			
		Simulering g=new Simulering();
		g.thrillSimulering();
		g.SkriveUt();
		g.AntOyne();
		System.out.println();
		g.SkriveUtTegning();
		g.AntOyneTegning();		
		System.out.println();
		System.out.println(g.getSum());
		g.gSKast();
		System.out.println("");
		int terningNR=1;
		System.out.println("Antall kast for � f� den f�rste "+terningNR+"-eren: "+g.f�rsteTall(terningNR)+"\n");
		g.flestResulat();		
	
		
		
	}
	

}
