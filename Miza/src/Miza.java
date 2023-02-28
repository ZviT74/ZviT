/**
 * Miza.java
 * Mitja Bokan
 */

// Uvozimo pakete za delo z GUI
import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

// Deklariramo javni razred			
public class Miza extends JFrame implements ActionListener {

	// Deklariramo zasebne lastnosti
	private JPanel povrsina;
	private JButton dodajJButton;
	private JTextField znamkaPolje, alkoholPolje;
	private JTable tabela;
	private PivskaSteklenicaTableModel modelTabele;
	
	// 
	// Vhodni parametri: vhodni parametri iz konzole
	// Potek/pis: 
	// Vrne vrednost: /
	/**
	 * Deklariramo javno statično metodo, ki se izveede ob zagonu programa
	 * Ustvari novo okno
	 * @param args
	 */
	public static void main(String[] args) {
	
		Miza m = new Miza("Miza s pivskimi steklenicami");
	
	}
	
	// Deklariramo javni konstruktor
	// Vhodni parametri: n - naslov okna
	// Potek/pis: vrne objekt tipa Miza
	// Vrne vrednost: vrne objekt tipa Miza
	public Miza(String n) {
		
		// Kličemo konstruktor nadrazreda
		super(n);
		
		// Inicializiramo zasebne lastnosti
		povrsina = new JPanel();
		dodajJButton = new JButton("Dodaj steklenico");
		dodajJButton.setForeground(UIManager.getColor("CheckBoxMenuItem.selectionForeground"));
		dodajJButton.setBackground(UIManager.getColor("CheckBoxMenuItem.acceleratorForeground"));
		znamkaPolje = new JTextField(32);
		znamkaPolje.setFont(new Font("Tahoma", Font.BOLD, 12));
		znamkaPolje.setToolTipText("Sem vnesete znamko piva");
		alkoholPolje = new JTextField(8);
		modelTabele = new PivskaSteklenicaTableModel();
		tabela = new JTable(modelTabele);
		
		// Površino dodamo na mizo
		getContentPane().add(povrsina);
		
		// Gumbu za dodajanje dodamo ActionListener
		dodajJButton.addActionListener(this);
		
		// Dodamo gumb, vnosna polja in tabelo na površino
		JLabel label = new JLabel("Znamka:");
		label.setLabelFor(znamkaPolje);
		povrsina.add(label);
		povrsina.add(znamkaPolje);
		JLabel label_1 = new JLabel("Stopnja alkohola:");
		label_1.setLabelFor(alkoholPolje);
		povrsina.add(label_1);
		povrsina.add(alkoholPolje);
		povrsina.add(dodajJButton);
		povrsina.add(tabela);		
		
		// Pokažemo okno
		setVisible(true);
		
		// Nastavimo velikost
		setSize(800, 600);
		
		// Nastavimo obnašanje križca (x) - končanje aplikacije
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		System.out.println("Ustvarjam objekt Miza");
		
	}

	// Deklariramo javno metodo, ki jo predpisuje vmesnik ActionListener
	// Vhodni parametri: dogodek
	// Potek/pis: doda steklenico v tabelo
	// Vrne vrednost: /
	public void actionPerformed(ActionEvent ae) {
		
		System.out.println("Dodajam steklenico...");
		System.out.println("Znamka je " + znamkaPolje.getText());
		System.out.println("Stopnja alkohola je " + alkoholPolje.getText());
		
		// Ustvarimo lokalno spremenljivko flasa
//		double d = Double.parseDouble(alkoholPolje.getText());
//		PivskaSteklenica flasa = new PivskaSteklenica(znamkaPolje.getText(), 500, d);
		
		// Dodamo objekt v tabelo
		modelTabele.addPivskaSteklenica(new PivskaSteklenica(znamkaPolje.getText(), 500, Double.parseDouble(alkoholPolje.getText())));
		
	}
	
	
}
	
