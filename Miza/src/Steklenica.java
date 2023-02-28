/**
 * Razred za delo s steklenicami
 * 
 * @author bokamit
 *
 */

// Deklariramo javni razred			
public class Steklenica {

		// Deklariramo lastnosti
		private int kolicinaVsebine;	// v ml
		private String vrstaVsebine;
		private boolean jeOdprta;
		private int kapaciteta;			// v ml

		// Deklariramo statično lastnost material
		public static final String material = "Steklo";
	
		/**
		 * Definiramo javni konstruktor, ki ustvari objekt tipa Steklenica
		 * Ustvari nov objekt tipa Steklenica
		 * 
		 */

		public Steklenica() {
	
			// Inicializiramo lastnosti objekta
			kolicinaVsebine = 0;
			vrstaVsebine ="";
			jeOdprta = false;
			kapaciteta = 0;
			
			System.out.println("Ustvarjamo nov objekt Steklenica");
		}
		
		/**
		 * Definiramo javni konstruktor, ki ustvari objekt tipa Steklenica
		 * Ustvari nov objekt tipa Steklenica
		 * 
		 * @param k kapaciteta steklenice
		 * 
		 */
		public Steklenica(int k) {
			
			// Inicializiramo lastnosti objekta
			kolicinaVsebine = 0;
			vrstaVsebine ="";
			jeOdprta = false;
			kapaciteta = k;
			
			System.out.println("Ustvarjamo nov objekt Steklenica s kapaciteto " + k);
		}

		/**
		 * Javna metoda za polnjenje steklenice
		 * Prišteje natočeno vsebino in doda vrsto vsebine
		 * 
		 * @param k količina vsebine
		 * @param v vrsta vsebine
		 * @return količina vsebine po polnjenju
		 * @throws Exception vrne izjemo, če je steklenica zaprta
		 */
		
		public int napolni(int k, String v) throws Exception {
			
			System.out.println("Količina vsebine pred polnenjem: " + kolicinaVsebine);
			
			if(jeOdprta) {
			
				// Dodamo količino
				kolicinaVsebine = kolicinaVsebine + k;
				// Dodamo vrsto vsebine
				vrstaVsebine = vrstaVsebine + v;
			
				System.out.println("Količina vsebine po polnenju: " + kolicinaVsebine);
						
			}			
			else {
								
				// Vrnemo izjemo za neuspešno polnjenje
				throw new Exception("Steklenica je zaprta!");
			}
			
			// Vrnemo količino vsebine
			return kolicinaVsebine;
				
		}
			
		/**
		 * Definiramo javno metodo za odpiranje steklenice
		 * Spremeni vrednost jeOdprta na true
		 * 
		 * @return true - polnenje uspešno, false - polnenje ni uspešno
		 */
		public boolean odpri() {
			
			System.out.println("Odpiram steklenico...");
			
			//Če je steklenica že odprta
			if(jeOdprta) {
				
				// Vrnemo flase
				return false;
			}
			else {
				
				// Odpremo steklenico
				jeOdprta = true;
				// Vrnemo true
				return true;
			}
		}
		
		/**
		 * Definiramo javno metodo za zapiranje steklenice
		 * Spremeni vrednost jeOdprta na false
		 * 
		 * @return true - polnenje uspešno, false - polnenje ni uspešno
		 */
		public boolean zapri() {
			
			System.out.println("Zapiram steklenico...");
			
			//Če je steklenica že odprta
			if(!jeOdprta) {
				
				// Vrnemo false
				return false;
			}
			else {
				
				// Zapremo steklenico
				jeOdprta = false;
				// Vrnemo true
				return true;
			}
		}

		/**
		 * Definiramo javno metodo ki vrne količino vsebine
		 * Vrne vrednost
		 * 
		 * @return količina vsebine
		 */
		public int getKolicinaVsebine() {
			return kolicinaVsebine;
		}
		

}