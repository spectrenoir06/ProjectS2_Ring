package projectS2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import javax.swing.border.TitledBorder;

public class Gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		panel.setLayout(new BorderLayout(0, 0));
		
		PersoInfo persoInfo = new PersoInfo("Bill",100,"/home/spectrenoir/eclipse/workspace/ProjectS2_Ring/src/skin0.png");
		panel.add(persoInfo, BorderLayout.WEST);
		
		PersoInfo persoInfo_1 = new PersoInfo("Bob",200,"/home/spectrenoir/eclipse/workspace/ProjectS2_Ring/src/skin1.png");
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
