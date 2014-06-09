package projectS2;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;


public class PersoInfo extends JPanel {

	/**
	 * Create the panel.
	 */
	
	private int initialpv;
	
	public PersoInfo(String name,int pv,String img) {
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
