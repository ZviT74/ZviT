			/*
				Ime datoteke:		Racunalnik.java
				Avtor:				Mitja Bokan
				Opis:				Računalnik z osnovnimi računalniškimi komponentami
			*/

// Deklariramo javni razred			
public class Racunalnik {

		// Deklariramo lastnosti
		private String vrstaCpu;
		private int kolicinaPomnilnika;	// v GB
		private int kapacitetaDisk0;	// v GB
		private boolean jePrizgan;
		private String vrstaSistema;

		// Definiramo javni konstruktor, ki ustvari objekt tipa Racunalnik
		// Vhodni parametri: /
		// Potek/opis: ustvari nov objekt tipa Racunalnik
		// Vrne vrednost: nov objekt
		public Racunalnik(String procesor, int ram, int disk0) {
			
			// Inicializiramo lastnosti objekta
			vrstaCpu = procesor;
			kolicinaPomnilnika = ram;
			kapacitetaDisk0 = disk0;
			jePrizgan = false;
			vrstaSistema = "";
			
			System.out.println("Sestavljamo nov računalnik");
		}
		
		// Definiramo javno metodo za dodajanje pomnilnika
		// Vhodni parametri: ram - pomnilnik
		// Potek/opis: doda sistemski pomnilnik
		// Vrne vrednost: true - dodajanje uspešno, false - dodajanje ni uspešno
		public boolean dodaj(int ram) {
			
			System.out.println("Dodajamo sistemski pomnilnik");
			
			// Namestimo dodamo sistemski pomnilnik
			kolicinaPomnilnika = kolicinaPomnilnika + ram;
			
			System.out.println("Računalnik ima  " + kolicinaPomnilnika + " GB pomnilnika");
						
			// Vrnemo uspešno dodajanje
			return true;
		}
		
		// Definiramo javno metodo za menjavo diska
		// Vhodni parametri: disk - nova velikost diska
		// Potek/opis: namesti nov disk
		// Vrne vrednost: true - menjava uspešna, false - menjava ni uspešna
		public boolean menjaj(int disk) {
			
			System.out.println("Menjamo trdi disk");
			
			// Namestimo dodamo sistemski pomnilnik
			kapacitetaDisk0 = disk;
			
			System.out.println("Računalnik ima disk s kapaciteto " + kapacitetaDisk0 + " GB");
						
			// Vrnemo uspešno menjavo
			return true;
		}

		
		// Definiramo javno metodo za nameščanje operacijskega sistema
		// Vhodni parametri: os - vrsta operacijskega sistema
		// Potek/opis: namesti operacijski sistem
		// Vrne vrednost: true - polnenje uspešno, false - polnenje ni uspešno
		public boolean namesti(String os) {
			
			System.out.println("Nameščamo operacijski sistem: " + os);
			
			// Namestimo operacijski sistem
			vrstaSistema = os;
			
			System.out.println("Namestili smo operacijski sistem: " + os);
						
			// Vrnemo uspešno nameščanje
			return true;
		}
		
		// Definiramo javno metodo za menjavo procesorja
		// Vhodni parametri: cpu - vrsta procesorja
		// Potek/opis: zamenja vrsto procesorja	
		// Vrne vrednost: true - menjava uspešna, false - menjava ni uspešna
		public boolean menjajcpu(String cpu) {
			
			System.out.println("Menjamo centralni procesor");
			
			// Namestimo nov procesor
			vrstaCpu = cpu;
			
			System.out.println("Namestili smo nov procesor " + vrstaCpu);
						
			// Vrnemo uspešno nameščanje
			return true;
		}
		
		// Deklariramo javno metodo, ki vrne lastnosti računalnika
		// Vhodni parametri: /
		// Potek/opis: izpiše vrednosti
		// Vrne vrednost: niz z lastnostmi
		public String getLastnosti() {
			return "Procesor: " + vrstaCpu + ", pomnilnik: " + kolicinaPomnilnika + "GB , disk: " + kapacitetaDisk0 + "GB" ;
		}

		// Deklariramo javno metodo, ki vrne procesor računalnika
		// Vhodni parametri: /
		// Potek/opis: izpiše procesor
		// Vrne vrednost: procesor
		public String getProcesor() {
			return vrstaCpu;
		}

		// Deklariramo javno metodo, ki vrne količino pomnilnika
		// Vhodni parametri: /
		// Potek/opis: izpiše količino pomnilnika
		// Vrne vrednost: količina pomnilnika
		public int getPomnilnik() {
			return kolicinaPomnilnika;
		}

		// Deklariramo javno metodo, ki vrne velikost diska
		// Vhodni parametri: /
		// Potek/opis: izpiše velikost diska
		// Vrne vrednost: količina pomnilnika
		public int getDisk0() {
			return kapacitetaDisk0;
		}

		

}