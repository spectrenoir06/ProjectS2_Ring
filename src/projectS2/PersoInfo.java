package projectS2;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("7906d434-f9b7-43ae-8ded-4a3ce06f24da")
public class PersoInfo extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@objid ("059537b5-b5d6-4e48-8ddc-a5eb1cfeb838")
    private int initialpv;

    @objid ("ddb77e6f-2fc2-4b5e-b9cb-ce509201e408")
    public PersoInfo(String name, int pv, String img) {
        setBorder(new TitledBorder(new LineBorder(new Color(184, 207, 229)), name, TitledBorder.CENTER, TitledBorder.TOP, null, null));
        setLayout(new BorderLayout(0, 0));
        
        this.initialpv = pv;
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setIcon(new ImageIcon(img));
        add(lblNewLabel_1, BorderLayout.NORTH);
        
        JLabel lblHp = new JLabel(initialpv + " Hp");
        lblHp.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblHp, BorderLayout.CENTER);
        
        JProgressBar progressBar = new JProgressBar();
        progressBar.setValue(100);
        progressBar.setStringPainted(true);
        progressBar.setForeground(new Color(255, 0, 0));
        add(progressBar, BorderLayout.SOUTH);
    }

}
