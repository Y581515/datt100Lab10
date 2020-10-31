package no.hvl.dat100.oppgave2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeseFraFil {


	static String MAPPE_STR = System.getProperty("user.dir") + "/src/dat100Lab10/";

	static public void main(String[] args) {

		String filnavn;

		int antall = 0;
		do {
			filnavn = JOptionPane.showInputDialog("Filnavn i mappen " + MAPPE_STR);

			try {
				File file = new File(MAPPE_STR + filnavn);
				Scanner reader = new Scanner(file);
				BufferedReader rreader = new BufferedReader(new FileReader(file));

				int linenumber = 1;

				// les innhold i filen linje for linje
				String line;

				while (reader.hasNextLine()) {
					line = reader.nextLine();
					System.out.println(linenumber + " " + line);
					linenumber++;
				}
				reader.close();

				while ((line = rreader.readLine()) != null) {

					System.out.println(linenumber + " " + line);
					linenumber++;
				}
				rreader.close();

				antall = 5;
			} catch (Exception e) {
				antall++;
				if (antall < 5) {
				} else {
					JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnesikke. \n" + e.getMessage());
				}

			}
		} while (antall < 5);

		// JOptionPane.showMessageDialog(null, "Filen " + filnavn + " finnes
		// ikke. \n" + e.getMessage());
	}
}
