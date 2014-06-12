package projectS2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("9835af97-355a-478f-867a-24a7d801ef5a")
public class Gui {
    @objid ("a4dd8aa7-257a-469b-8466-fa9d411ae312")
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Gui window = new Gui();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @objid ("4522ba48-7470-4acf-98ee-2d55047195f2")
    private JFrame frame;

    @objid ("7653d8e4-416b-4ccb-961a-10e08faf9d39")
    public Gui() {
        initialize();
    }

    @objid ("549b4ef7-f18b-4aa8-9002-655f8fb75b1c")
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 900, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.NORTH);
        panel.setLayout(new BorderLayout(0, 0));
        
        PersoInfo persoInfo = new PersoInfo("Bill",100,"/home/spectrenoir/eclipse/workspace/ProjectS2_Ring/src/guerrierR.png");
        panel.add(persoInfo, BorderLayout.WEST);
        
        PersoInfo persoInfo_1 = new PersoInfo("Bob",200,"/home/spectrenoir/eclipse/workspace/ProjectS2_Ring/src/mageL.png");
        panel.add(persoInfo_1, BorderLayout.EAST);
        
        JScrollPane scrollPane = new JScrollPane();
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new TitledBorder(null, "Capacites", TitledBorder.CENTER, TitledBorder.TOP, null, null));
        scrollPane.setViewportView(panel_1);
        panel_1.setLayout(new GridLayout(0, 1, 0, 0));
        
        jCapacite jCapacite_ = new jCapacite((String) null);
        panel_1.add(jCapacite_);
        
        jCapacite jCapacite__1 = new jCapacite((String) null);
        panel_1.add(jCapacite__1);
        
        jCapacite jCapacite__2 = new jCapacite((String) null);
        panel_1.add(jCapacite__2);
    }

}
