package projectS2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("39ad14cb-875f-4874-b7e9-82a39375d665")
public class CreePersoGui extends JFrame {
    @objid ("3c03245b-b488-48ba-9af7-33a6fdde4f8b")
    private JPanel contentPane;

    @objid ("41b2ca15-6df8-49f4-b9ae-c80943599fc9")
    private JTextField txtName;

    @objid ("50acc27e-801c-4eb6-bcbc-1d2984550ee6")
    private JRadioButton radioButton;

    @objid ("d49beef2-9d6e-4f7c-8963-ccd55e223ca9")
    private JRadioButton radioButton_1;

    @objid ("a76bfc6c-d036-4fac-975f-591b313875e9")
    private JRadioButton radioButton_2;

    @objid ("d42a3305-94bd-42ef-a040-e0f52bff4dc5")
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreePersoGui frame = new CreePersoGui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @objid ("6a8d35b9-4011-467c-bccf-382189ed8ee2")
    public CreePersoGui() throws Exception {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 559, 470);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        
        JPanel panel = new JPanel();
        contentPane.add(panel, BorderLayout.WEST);
        panel.setLayout(new BorderLayout(0, 0));
        
        JPanel Classe = new JPanel();
        panel.add(Classe, BorderLayout.CENTER);
        Classe.setBorder(new TitledBorder(null, "Classe", TitledBorder.CENTER, TitledBorder.TOP, null, null));
        Classe.setLayout(new GridLayout(0, 1, 0, 0));
        
        radioButton = new JRadioButton("Guerrier");
        radioButton.setSelected(true);
        Classe.add(radioButton);
        
        radioButton_1 = new JRadioButton("Mage");
        Classe.add(radioButton_1);
        
        radioButton_2 = new JRadioButton("Athlete");
        Classe.add(radioButton_2);
        
        txtName = new JTextField();
        txtName.setText("Name");
        panel.add(txtName, BorderLayout.NORTH);
        txtName.setColumns(10);
        
        JPanel panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.EAST);
        panel_1.setLayout(new GridLayout(0, 1, 0, 0));
        
        PlusMoins plusMoins = new PlusMoins("Force", 0, 10, 0);
        panel_1.add(plusMoins);
        
        PlusMoins plusMoins_1 = new PlusMoins("Dexterite", 0, 10, 0);
        panel_1.add(plusMoins_1);
        
        PlusMoins plusMoins_2 = new PlusMoins("intelligence", 0, 10, 0);
        panel_1.add(plusMoins_2);
        
        PlusMoins plusMoins_3 = new PlusMoins("concentration", 0, 10, 0);
        panel_1.add(plusMoins_3);
        
        JScrollPane scrollPane = new JScrollPane();
        contentPane.add(scrollPane, BorderLayout.SOUTH);
        
        JPanel panel_2 = new JPanel();
        scrollPane.setViewportView(panel_2);
        panel_2.setLayout(new GridLayout(0, 1, 0, 0));
        
        jCapacite jCapacite__2 = new jCapacite((String) null);
        panel_2.add(jCapacite__2);
        
        jCapacite jCapacite__1 = new jCapacite((String) null);
        panel_2.add(jCapacite__1);
        
        jCapacite jCapacite_ = new jCapacite((String) null);
        panel_2.add(jCapacite_);
        
        JLabel Img = new JLabel("");
        contentPane.add(Img, BorderLayout.CENTER);
        Img.setIcon(new ImageIcon("src/guerrierR.png"));
    }

}
