/**
 * PivskaSteklenica.java
 * @author bokamit
 *
 */
// Deklariramo javni razred, ki razširja razred Steklenica
public class PivskaSteklenica extends Steklenica implements AlkoholnaPijaca {
	
	// Vse lastnosti nadrazreda se prenesejo
	
	// Deklariramo nove lastnosti
	private String znamka;
	private boolean jePovratna;
	private double temperatura;		// v stopinjah celzija
	private double stopnjaAlkohola; // V procentih
	
	/**
	 * Deklariramo javni konstruktor PivskaSteklenica
	 * @param z znamka
	 * @param k kapaciteta
	 * @param s stopnja alkohola
	 */
	public PivskaSteklenica(String z, int k, double s) {
		// Pokličemo konstruktor nadrazreda
		// Ta ukaz mora biti vedno prvi v nizu ukazov
		super(k);
		
		// Napolnimo steklenico - kličemo metodo, deklarirano v nadrazredu
		odpri();
		try {
			napolni(k, "Pivo");
		}
		catch(Exception e) {
			System.out.println("Napaka pri polnjenju: " + e);
		}
		zapri();
		
		// Inicializiramo še ostale lastnosti
		znamka = z;
		jePovratna = false;
		temperatura = 22.0;
		stopnjaAlkohola = s;
				
	}
	
	/**
	 * Deklariramo javno metodo, ki ohladi pivo na želeno temperaturo [st. C]
	 * Zniža temperaturo
	 * @param t temperatura
	 */
	public void ohladi(double t) {
		
		System.out.println("Hladim pivo " + znamka + " iz " + temperatura + " na ");
		
		// Znižamo temeraturo piva
		temperatura = temperatura - t;
	
		System.out.println(temperatura + " st. C");
	}
	
	/**
	 * Deklariramo javno metodo, ki vrne znamko in količino
	 * Vrne niz z znamko in količino vsebine
	 * @return
	 */
	public String getZnamkaKolicina() {
		return znamka + ", " + getKolicinaVsebine() + " ml";
	}
	
	/**
	 * Deklariramo javno metodo, ki vrne stopnjo alkohola in jo predpisuje vmesnik AlkoholnaPijaca
	 * Vrne stopnjo double - stopnja alkohola
	 */
	public double getStopnjaAlkohola() {
		
		return stopnjaAlkohola;
	
	}
	
}
