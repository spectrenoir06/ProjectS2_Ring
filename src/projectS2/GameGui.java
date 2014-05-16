package projectS2;

import java.awt.*;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

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

    @objid ("4c93c386-3900-4ad1-9edf-9a0bba4229d1")
    @SuppressWarnings("serial")
    public class PlusMoins extends JPanel {
        @objid ("7df8d11b-acb2-4479-b8c3-b23efbbc29ea")
        private int bornMoins;

        @objid ("23ff050d-dc1f-4bc5-892a-9117152dfed2")
        private int bornPlus;

        @objid ("cddddbe8-0701-47f9-834f-ac2845de9c34")
        private int nb;

        @objid ("e98c3e38-8fff-4b5e-81c5-cbfcb02737c7")
        private boolean isOn;

        @objid ("35e86688-abaf-44f8-bea5-f29a708d4a64")
         JPanel panel;

        @objid ("06dc705a-af99-4141-98fa-772e5d8d66bf")
         JButton bPlus;

        @objid ("7b59e122-810b-407b-8c43-dcdc8a84355f")
         JButton bMoins;

        @objid ("99b660e4-969d-47ce-ba39-ae12a950f988")
         JLabel labelText;

        @objid ("87af4485-747c-47bf-a349-94c5193ed72b")
        public PlusMoins(String title, int moins, int plus, int init) throws Exception {
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

        @objid ("c6a2910b-3d25-402c-afed-a3cb9fb60bad")
        public void setUse(boolean isOn) {
            this.isOn = isOn;
            if(isOn){
                reBorne();
            }else{
                bMoins.setEnabled(false);
                bPlus.setEnabled(false);
            }
        }

        @objid ("595904de-fa01-4529-9683-fd36fdacf056")
        public void reBorne() {
            bMoins.setEnabled(nb > bornMoins);
            bPlus.setEnabled(nb < bornPlus);
            labelText.setText(nb + "");
        }

        @objid ("778fa20a-50d0-47aa-8bd9-a0fdaf43383b")
        public void setBorneMoins(int born) {
            if (born>this.bornPlus){
                System.out.println("Erreur born- > born+");
            }else if(born>nb){
                System.out.println("Erreur born- > nb");
            }else{
                this.bornMoins = born;
                reBorne();
            }
        }

        @objid ("645da681-61b4-4455-b6fd-61c65fcbb5f2")
        public void setBornePlus(int born) {
            if (born<this.bornMoins){
                System.out.println("Erreur born+ < born-");
            }else if(born<nb){
                System.out.println("Erreur born+ < nb");
            }else{
                this.bornPlus = born;
                reBorne();
            }
        }

        @objid ("1ff64907-2e75-495b-933b-a362df46cad2")
        public int getNb() {
            return this.nb;
        }

    }

}
