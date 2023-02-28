			/*
				Ime datoteke:		GraficnaPostaja.java
				Avtor:				Mitja Bokan
				Opis:				Računalnik za delo z grafiko
			*/

// Deklariramo javni razred			
public class GraficnaPostaja extends Racunalnik {

	// Vse lastnosti nadrazreda se prenesejo
	
	// Deklariramo nove lastnosti
	private String graficnaKartica;
	private int kapacitetaDisk1;

	// Definiramo javni konstruktor, ki ustvari objekt tipa GraficnaPostaja
	// Vhodni parametri: g - grafična kartica, d - kapaciteta drugega diska
	// Potek/opis: ustvari nov objekt tipa GraficnaPostaja
	// Vrne vrednost: nov objekt
	public GraficnaPostaja(String procesor, String g, int d) {
		
		// Pokličemo konstruktor nadrazreda
		super(procesor, 64, 256);
		
		// Inicializiramo dodatne lastnosti objekta
		graficnaKartica = g;
		kapacitetaDisk1 = d;
		
	}
		
	// Definiramo javno metodo za menjavo grafične kartice
	// Vhodni parametri: grafika - nova grafična kartica
	// Potek/opis: zamenja grafično kartico
	// Vrne vrednost: true - menjava uspešna, false - menjava ni uspešna
	public boolean menjajgrafiko(String grafika) {
			
		System.out.println("Menjamo grafično kartico");
		
		// Namestimo novo grafično kartico
		graficnaKartica = grafika;
			
		System.out.println("Računalnik ima grafično kartico " + graficnaKartica);
						
		// Vrnemo uspešno menjavo
		return true;
	}

}