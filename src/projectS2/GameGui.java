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


@objid ("5be3a65b-5561-4379-a02c-e665ea556a83")
public class GameGui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Game game;
	private JTextField txtName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public GameGui(){
		super("Ring");
		this.init();
		this.setSize(900, 600);
		this.setVisible(true);
		
		this.game = new Game();
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
	}
	
	private void init(){
		Container c = this.getContentPane();
		
		JPanel jCara = new JPanel();
		getContentPane().add(jCara, BorderLayout.WEST);
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
		

		
		jCara.add(cara("Force"));
		jCara.add(cara("Dexterite"));
		jCara.add(cara("Inteligence"));
		jCara.add(cara("Concentration"));
		
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
		/*
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JPanel jCapa = new JPanel();
		scrollPane.setViewportView(jCapa);
		jCapa.setLayout(new GridLayout(10, 1, 0, 0));
		
		JPanel JCapacite1 = new JPanel();
		JCapacite1.setBorder(new TitledBorder(null, "Capacite 1", TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, null));
		jCapa.add(JCapacite1);
		JCapacite1.setLayout(new BoxLayout(JCapacite1, BoxLayout.X_AXIS));
		
		JSpinner spinner = new JSpinner();
		JCapacite1.add(spinner);
		spinner.setModel(new SpinnerListModel(new String[] {"Guerrier", "Mage", "Athlete"}));
		
		JPanel panel = new JPanel();
		JCapacite1.add(panel);
		
		JPanel jCapa1Cara1 = new JPanel();
		panel.add(jCapa1Cara1);
		jCapa1Cara1.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Impact", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		jCapa1Cara1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.print(arg0.toString());
			}
		});
		jCapa1Cara1.add(button_10);
		
		JLabel label_5 = new JLabel("0");
		jCapa1Cara1.add(label_5);
		
		JButton button_11 = new JButton("+");
		jCapa1Cara1.add(button_11);
		
		JPanel jCapa1Cara2 = new JPanel();
		panel.add(jCapa1Cara2);
		jCapa1Cara2.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Puissance", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		jCapa1Cara2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_8 = new JButton("-");
		jCapa1Cara2.add(button_8);
		
		JLabel label_4 = new JLabel("0");
		jCapa1Cara2.add(label_4);
		
		JButton button_9 = new JButton("+");
		jCapa1Cara2.add(button_9);
		
		JPanel jCapa1Cara3 = new JPanel();
		panel.add(jCapa1Cara3);
		jCapa1Cara3.setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), "Parade", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		jCapa1Cara3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton button_6 = new JButton("-");
		jCapa1Cara3.add(button_6);
		
		JLabel label_3 = new JLabel("0");
		jCapa1Cara3.add(label_3);
		
		JButton button_7 = new JButton("+");
		jCapa1Cara3.add(button_7);
		*/
		
		
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
	
	
	public static void main(String[] args){
    	GameGui game = new GameGui();
	}
}
