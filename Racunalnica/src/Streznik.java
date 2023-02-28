			/*
				Ime datoteke:		Streznik.java
				Avtor:				Mitja Bokan
				Opis:				Strežniški računalnik
			*/

// Deklariramo javni razred			
public class Streznik extends Racunalnik implements PodatkovniStreznik {

	// Vse lastnosti nadrazreda se prenesejo
	
	// Deklariramo nove lastnosti
	private int kapacitetaDisk1;
	private int kapacitetaDisk2;
	private int diskRaid;
	private String podatkovniStreznik;

	// Definiramo javni konstruktor, ki ustvari objekt tipa Streznik
	// Vhodni parametri: d - kapaciteta obeh diskov, r - raid polje, s -podatkovni strežnik
	// Potek/opis: ustvari nov objekt tipa Streznik
	// Vrne vrednost: nov objekt
	public Streznik(String procesor, int d, int r, String s) {
		
		// Pokličemo konstruktor nadrazreda
		super(procesor, 64, 256);
		
		// Inicializiramo dodatne lastnosti objekta
		kapacitetaDisk1 = d;
		kapacitetaDisk2 = d;
		diskRaid = r;
		podatkovniStreznik = s;

		// Zamenjamo procesor
		menjajcpu("Intel Xeon");

	}
	
	// Definiramo javno metodo za menjavo vrste RAID polja
	// Vhodni parametri: cpu - nov procesor
	// Potek/opis: zamenja procesor
	// Vrne vrednost: true - menjava uspešna, false - menjava ni uspešna
	public boolean menjajraid(int raid) {
		
		System.out.println("Menjamo vrsto RAID polja");
			
		// Menjamo RAID polje
		diskRaid = raid;
		
		if(diskRaid == 1) {
			System.out.println("Računalnik ima RAID polje " + diskRaid + " s kapaciteto " + kapacitetaDisk1 + " GB");
			// Vrnemo uspešno menjavo
			return true;
		}
		else if(diskRaid == 0){
			System.out.println("Računalnik ima RAID polje " + diskRaid + " s kapaciteto " + (kapacitetaDisk1 * 2) + " GB");
			// Vrnemo uspešno menjavo
			return true;
		}
		else {
			System.out.println("RAID polja vrste " + diskRaid + " ta strežnik ne podpira!");
			return false;
		}
	}
	// Definiramo javno metodo, ki vrne vrsto podatkovnega strežnika
	// Vhodni parametri: /
	// Potek/opis: vrne vrsto podatkovnega streznika
	// Vrne vrednost: double vrsta podatkovnega strežnika
	public String getPodatkovniStreznik() {
		return podatkovniStreznik;
	}	
	

}