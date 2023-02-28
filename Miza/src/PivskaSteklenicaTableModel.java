/*
Ime datoteke:		PivskaSteklenicaTableModel.java
Avtor:				Mitja Bokan
*/

import javax.swing.table.*;

public class PivskaSteklenicaTableModel extends DefaultTableModel {
	
	// Konstruktor
	public PivskaSteklenicaTableModel() {
		
		// Kliče konstruktor nadrazreda
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Znamka");
		addColumn("Stopnja alkohola");
		// Ustvarimo statičen seznam objektov
		Object [] vrstica = new Object [] {"Znamka test", "Stopnja test"};
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
		// Dodamo naslovno vrstivo
		
		
	}

	// Deklariramo javno metodo, ki doda pivsko steklenico v seznam in tabelo
	// Vhodni parametri: ps - PivskaSteklenica
	// Potek/pis: doda steklenico v tabelo
	// Vrne vrednost: /
	public void addPivskaSteklenica(PivskaSteklenica ps) {
		
		// Ustvarimo statičen seznam objektov
		Object [] vrstica = new Object [] {ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
	
	
}