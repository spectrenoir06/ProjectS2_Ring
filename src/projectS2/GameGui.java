package projectS2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import projectS2.PlusMoins;

@objid ("255002b0-52b8-471d-acf1-7cc67c684a9b")
@SuppressWarnings("unused")
public class GameGui extends Game {
    @objid ("a88c6f74-57f8-42cd-868b-663c403b47a6")
    private static final long serialVersionUID = 1L;

    @objid ("4d492907-72b2-477d-8533-df67f6058d6e")
    private JTextField txtName;

    @objid ("9c0000ba-3d38-4441-8876-ebd0301770fe")
    private final ButtonGroup buttonGroup = new ButtonGroup();

    @objid ("17c06085-31c8-4971-8415-c802827afbab")
    private Game game;

    @objid ("ed2b02a4-0e69-4cba-b0a2-eebe8bc2a054")
    public static void main(String[] args) throws Exception {
        new GameGui();
    }

    @objid ("8187238c-5cd4-4e42-a63e-055790fb6660")
    public GameGui() throws Exception {
        super("Ring");
        this.init();
        this.setSize(900, 600);
        this.setMinimumSize(this.getSize());
        this.setVisible(true);
    }

    @objid ("0431cd55-d3dd-4e80-b859-2ebfa1886b3a")
    private JPanel cara(String text) {
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

    @objid ("0c616b7a-8ad0-4532-ae75-f4cccdcede99")
    private void init() throws Exception {
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
        
        
        PlusMoins jForce = new PlusMoins("Force", 0, 10, 5);
        PlusMoins jDexterite = new PlusMoins("Dexterite", 10, 20, 5);
        PlusMoins jInteligence = new PlusMoins("Inteligence", 0, 100, 5);
        PlusMoins jConcentration = new PlusMoins("Concentration", 5, 5, 5);
        
        
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
        
        jCapacite capacite1 = new jCapacite("Capacite 1");
        jCapa.add(capacite1);
        
        jCapacite capacite2 = new jCapacite("Capacite 2");
        jCapa.add(capacite2);
        
        jCapacite capacite3 = new jCapacite("Capacite 3");
        jCapa.add(capacite3);
        
        jCapacite capacite4 = new jCapacite("Capacite 4");
        jCapa.add(capacite4);
    }

}
