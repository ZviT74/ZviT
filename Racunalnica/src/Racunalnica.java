/*
Ime datoteke:		Racunalnica.java
Avtor:				Mitja Bokan
Vhodni podatki:		/
Opis:				Aplikacija z grafičnim uporabniškim vmesnikom za sestavljanje računalnikov
Izhodni podatki:	Okno grafičnega vmesnika
*/

// Uvozimo pakete za delo z GUI
import javax.swing.*;
import java.awt.event.*;

// Deklariramo javni razred			
public class Racunalnica extends JFrame implements ActionListener {

	// Deklariramo zasebne lastnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField procesorPolje, pomnilnikPolje, diskPolje, grafikaPolje, raidPolje, bazaPolje;
	private JTable tabela;
	private RacunalnikiTableModel modelTabele;

	// Deklariramo javno statično metodo, ki se izveede ob zagonu programa
	// Vhodni parametri: vhodni parametri iz konzole
	// Potek/pis: ustvari novo okno
	// Vrne vrednost: /
	public static void main(String[] args) {
	
		Racunalnica r = new Racunalnica("Računalnica z računalniki");
	
	}
	
	// Deklariramo javni konstruktor
	// Vhodni parametri: n - naslov okna
	// Potek/pis: vrne objekt tipa Racunalnica
	// Vrne vrednost: vrne objekt tipa Racunalnica
	public Racunalnica(String n) {
		
		// Kličemo konstruktor nadrazreda
		super(n);
		
		// Inicializiramo zasebne lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj računalnik");
		procesorPolje = new JTextField(16);
		pomnilnikPolje = new JTextField(16);
		diskPolje = new JTextField(16);
		grafikaPolje = new JTextField(16);
		raidPolje = new JTextField(2);
		bazaPolje = new JTextField(16);
		modelTabele = new RacunalnikiTableModel();
		tabela = new JTable(modelTabele);
		
		// Dodamo površino
		add(povrsina);
		
		// Gumbu za dodajanje dodamo ActionListener
		dodajJButton.addActionListener(this);
		
		// Dodamo gumb, vnosna polja in tabelo za računalnike na površino
		povrsina.add(new JLabel("Procesor:"));
		povrsina.add(procesorPolje);
		povrsina.add(new JLabel("Pomnilnik:"));
		povrsina.add(pomnilnikPolje);
		povrsina.add(new JLabel("Disk:"));
		povrsina.add(diskPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);		
		
		// Pokažemo okno
		setVisible(true);
		
		// Nastavimo velikost
		setSize(1024, 600);
		
		// Nastavimo obnašanje križca (x) - končanje aplikacije
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	// Deklariramo javno metodo, ki jo predpisuje vmesnik ActionListener
	// Vhodni parametri: dogodek
	// Potek/pis: doda steklenico v tabelo
	// Vrne vrednost: /
	public void actionPerformed(ActionEvent ae) {
		
		// Ustvarimo lokalno spremenljivko racunalnik
		String p = procesorPolje.getText();
		int r = Integer.parseInt(pomnilnikPolje.getText());
		int d = Integer.parseInt(diskPolje.getText());
		Racunalnik desktop = new Racunalnik(p, r, d);
		
		// Dodamo objekt v tabelo
		modelTabele.addRacunalnik(new Racunalnik(p, r, d));
		
	}
	
	
}
