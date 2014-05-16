package projectS2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("unused")
@objid ("5be3a65b-5561-4379-a02c-e665ea556a83")
public class GameGui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private Game game;
	private JTextField txtName;
	private PlusMoins jForce, jDexterite ,jInteligence, jConcentration;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public GameGui() throws Exception{
		super("Ring");
		this.init();
		this.setSize(900, 600);
		this.setVisible(true);
	}
	
	private void init() throws Exception{
		Container c = this.getContentPane();
		
		JPanel jCara = new JPanel();
		c.add(jCara, BorderLayout.WEST);
		jCara.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel jClasse = new JPanel();
		jClasse.setBorder(new TitledBorder(null, "Classe", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		jCara.add(jClasse);
		jClasse.setLayout(new GridLayout(0, 1, 0, 0));
		
		JRadioButton buttonGuerrier = new JRadioButton("Guerrier");
		buttonGroup.add(buttonGuerrier);
		buttonGuerrier.setSelected(true);
		jClasse.add(buttonGuerrier);
		
		JRadioButton buttonMage = new JRadioButton("Mage");
		buttonGroup.add(buttonMage);
		jClasse.add(buttonMage);
		
		JRadioButton buttonAthlete = new JRadioButton("Athlete");
		buttonGroup.add(buttonAthlete);
		jClasse.add(buttonAthlete);
		

		jForce = new PlusMoins("Force", 0, 10, 5);
		jDexterite = new PlusMoins("Dexterite", 10, 20, 5);
		jInteligence = new PlusMoins("Inteligence", 0, 100, 5);
		jConcentration = new PlusMoins("Concentration", 5, 5, 5);
		
		
		try {
			jCara.add(jForce);
			jCara.add(jDexterite);
			jCara.add(jInteligence);
			jCara.add(jConcentration);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		JPanel jName = new JPanel();
		getContentPane().add(jName, BorderLayout.NORTH);
		
		txtName = new JTextField();
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setText("Name");
		jName.add(txtName);
		txtName.setColumns(10);
		
		JPanel Jconsol = new JPanel();
		getContentPane().add(Jconsol, BorderLayout.SOUTH);
		Jconsol.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnTest = new JTextPane();
		txtpnTest.setText("test");
		Jconsol.add(txtpnTest, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("Talk");

		
		Jconsol.add(btnNewButton, BorderLayout.EAST);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		
		// cap 
		
		JPanel jCapa = new JPanel();
		scrollPane.setViewportView(jCapa);
		jCapa.setLayout(new GridLayout(10, 1, 0, 0));
		
		//cap1
		
		JPanel JCapacite1 = new JPanel();
		JCapacite1.setBorder(new TitledBorder(null, "Capacite 1", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, null));
		JCapacite1.setLayout(new BoxLayout(JCapacite1, BoxLayout.X_AXIS));
		
		JSpinner spinner = new JSpinner();
		JCapacite1.add(spinner);
		spinner.setModel(new SpinnerListModel(new String[] {"Eppe", "Bouclier", " ... "}));
		
		JPanel panel = new JPanel();
		JCapacite1.add(panel);
		
		JPanel jCapa1Cara1 = new PlusMoins("Impact", 20, 50, 20);
		JPanel jCapa1Cara2 = new PlusMoins("Parade", 20, 50, 20);
		JPanel jCapa1Cara3 = new PlusMoins("Impact", 20, 50, 20);
		panel.add(jCapa1Cara1);
		panel.add(jCapa1Cara2);
		panel.add(jCapa1Cara3);
		
		jCapa.add(JCapacite1);
		// ----------------cap2--------------------//
		
		JPanel JCapacite2 = new JPanel();
		JCapacite2.setBorder(new TitledBorder(null, "Capacite 2", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, null));
		JCapacite2.setLayout(new BoxLayout(JCapacite2, BoxLayout.X_AXIS));
		
		JSpinner spinner2 = new JSpinner();
		JCapacite2.add(spinner2);
		spinner2.setModel(new SpinnerListModel(new String[] {"Eppe", "Bouclier", " ... "}));
		
		JPanel panel2 = new JPanel();
		JCapacite2.add(panel2);
		
		JPanel jCapa2Cara1 = new PlusMoins("Impact", 20, 50, 20);
		JPanel jCapa2Cara2 = new PlusMoins("Parade", 20, 50, 20);
		JPanel jCapa2Cara3 = new PlusMoins("Impact", 20, 50, 20);
		panel2.add(jCapa2Cara1);
		panel2.add(jCapa2Cara2);
		panel2.add(jCapa2Cara3);
		
		jCapa.add(JCapacite2);
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtName.setText(jForce.getNb()  + ";" + jDexterite.getNb()+ ";" + jInteligence.getNb() + ";" + jConcentration.getNb());
				
			}
		});
	}
	
	private JPanel cara(String text){
		JPanel j = new JPanel();
		j.setBorder(new TitledBorder(null, text, TitledBorder.CENTER, TitledBorder.TOP, null, null));
		
		j.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton buttonMoins = new JButton("-");
		buttonMoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		j.add(buttonMoins);
		
		JLabel label = new JLabel("0");
		j.add(label);
		
		JButton buttonPlus = new JButton("+");
		j.add(buttonPlus);
		
		return j;
	}
	
	
	public static void main(String[] args) throws Exception{
    	new GameGui();
	}
	
	@SuppressWarnings("serial")
	public class PlusMoins extends JPanel{
		private int bornMoins, bornPlus, nb;
		private boolean isOn;
		JPanel panel;
		JButton bPlus, bMoins;
		JLabel labelText;
		
		public PlusMoins(String title, int moins, int plus ,int init) throws Exception{
			super();
			
			if(plus<moins){
				throw new Exception("Born+ < Born-");
			}else if (init<moins){
				init = moins;
			}else if (init>plus){
				init = plus;
			}
			
			this.bornMoins = moins;
			this.bornPlus  = plus;
			this.nb = init;
			this.isOn = true;
			
			setBorder(new TitledBorder(null, title, TitledBorder.CENTER, TitledBorder.TOP, null, null));
			setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			bMoins = new JButton("-");
			bMoins.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nb--;
					reBorne();
				}
			});
			bPlus = new JButton("+");
			bPlus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					nb++;
					reBorne();
				}
			});
			labelText = new JLabel(nb +"");
			
			reBorne();
			
			add(bMoins);
			add(labelText);
			add(bPlus);
		}
		
		public void setUse(boolean isOn){
			this.isOn = isOn;
			if(isOn){
				reBorne();
			}else{
				bMoins.setEnabled(false);
				bPlus.setEnabled(false);
			}
			
		}
		
		public void reBorne(){
			bMoins.setEnabled(nb > bornMoins);
			bPlus.setEnabled(nb < bornPlus);
			labelText.setText(nb + "");
		}
		
		public void setBorneMoins(int born){
			if (born>this.bornPlus){
				System.out.println("Erreur born- > born+");
			}else if(born>nb){
				System.out.println("Erreur born- > nb");
			}else{
				this.bornMoins = born;
				reBorne();
			}
		}
		public void setBornePlus(int born){
			if (born<this.bornMoins){
				System.out.println("Erreur born+ < born-");
			}else if(born<nb){
				System.out.println("Erreur born+ < nb");
			}else{
				this.bornPlus = born;
				reBorne();
			}
		}
		
		public int getNb(){
			return this.nb;
		}
		
	}	
}
