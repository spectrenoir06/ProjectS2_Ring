package projectS2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;

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
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/spectrenoir/eclipse/workspace/ProjectS2_Ring/src/test.png"));
		panel_2.add(lblNewLabel, BorderLayout.NORTH);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setValue(75);
		panel_2.add(progressBar, BorderLayout.CENTER);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setStringPainted(true);
		progressBar_1.setBackground(Color.ORANGE);
		progressBar_1.setForeground(Color.BLUE);
		progressBar_1.setValue(50);
		panel_2.add(progressBar_1, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.EAST);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		jCapacite jCapacite_ = new jCapacite((String) null);
		panel_3.add(jCapacite_);
		
		jCapacite jCapacite__1 = new jCapacite((String) null);
		panel_3.add(jCapacite__1);
		
		jCapacite jCapacite__2 = new jCapacite((String) null);
		panel_3.add(jCapacite__2);
		
		jCapacite jCapacite__3 = new jCapacite((String) null);
		panel_3.add(jCapacite__3);
		
		jCapacite jCapacite__4 = new jCapacite((String) null);
		panel_3.add(jCapacite__4);
		
		jCapacite jCapacite__5 = new jCapacite((String) null);
		panel_3.add(jCapacite__5);
	}

}
