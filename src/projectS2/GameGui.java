package projectS2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import projectS2.PlusMoins;

@objid ("5be3a65b-5561-4379-a02c-e665ea556a83")
@SuppressWarnings("unused")
public class GameGui extends JFrame {
    @objid ("66fde004-e939-4e28-9015-5533f952e685")
    private static final long serialVersionUID = 1L;

    @objid ("7a864581-35c3-41dd-8fb1-f457e15f20cf")
    private JTextField txtName;

    @objid ("63e5d77d-6cdc-409a-a2e6-e13e66eef970")
    private PlusMoins jForce;

    @objid ("e57c6e6b-13b7-4a70-b322-a9865c3a5e71")
    private PlusMoins jDexterite;

    @objid ("0823c1f3-06fe-424b-9247-886529b23580")
    private PlusMoins jInteligence;

    @objid ("24532838-fe20-45d1-9637-d16043b865f3")
    private PlusMoins jConcentration;

    @objid ("8dc7e05d-4763-49f9-88ac-62c957b52101")
    private final ButtonGroup buttonGroup = new ButtonGroup();

    @objid ("4771fe82-c5aa-46eb-821f-90b34dd614e7")
    private Game game;

    @objid ("3020179e-8e31-4470-9584-b78561a15e46")
    public GameGui() throws Exception {
        super("Ring");
        this.game = new Game();
        this.init();
        this.setSize(900, 600);
        this.setMinimumSize(this.getSize());
        this.setVisible(true);
    }

    @objid ("a2ab947f-997a-4be7-a304-26276f99abf4")
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
        
        jCapacite capacite1 = new jCapacite("Capacite 1");
        jCapa.add(capacite1);
        
        jCapacite capacite2 = new jCapacite("Capacite 2");
        jCapa.add(capacite2);
        
        jCapacite capacite3 = new jCapacite("Capacite 3");
        jCapa.add(capacite3);
        
        jCapacite capacite4 = new jCapacite("Capacite 4");
        jCapa.add(capacite4);
        
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                txtName.setText(jForce.getNb()  + ";" + jDexterite.getNb()+ ";" + jInteligence.getNb() + ";" + jConcentration.getNb());
                
            }
        });
    }

    @objid ("a807fb1f-4954-4914-8faa-ab2437c2d6e5")
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

    @objid ("cd1d3e26-1d8f-48ac-b034-1803150c20a1")
    public static void main(String[] args) throws Exception {
        new GameGui();
    }

}
