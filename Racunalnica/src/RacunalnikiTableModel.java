/*
Ime datoteke:		RacunalnikiTableModel.java
Avtor:				Mitja Bokan
*/

import javax.swing.table.*;

public class RacunalnikiTableModel extends DefaultTableModel {
	
	// Konstruktor
	public RacunalnikiTableModel() {
		
		// Kliče konstruktor nadrazreda
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Procesor");
		addColumn("Pomnilnik");
		addColumn("Disk");
		// Ustvarimo statičen seznam objektov
		Object [] vrstica = new Object [] {"Procesor", "Pomnilnik", "Disk"};
		// Dodamo vrstico v tabelo
		addRow(vrstica);
				
	}

	// Deklariramo javno metodo, ki doda računalnik v seznam in tabelo
	// Vhodni parametri: ra - Racunalnik
	// Potek/pis: doda računalnik v tabelo
	// Vrne vrednost: /
	public void addRacunalnik(Racunalnik ra) {
		
		// Ustvarimo statičen seznam objektov
		Object [] vrstica = new Object [] {ra.getProcesor(), ra.getPomnilnik(), ra.getDisk0()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
	
	
}