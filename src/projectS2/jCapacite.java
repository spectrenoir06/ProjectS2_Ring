package projectS2;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.GridLayout;
public class jCapacite extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel caraPanel;
	private PlusMoins cara1, cara2, cara3;
	private JSpinner spinner;
	
	
	public jCapacite(String title) {
		super();
		this.setBorder(new TitledBorder(null, title, TitledBorder.CENTER, TitledBorder.BELOW_TOP, null, null));
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		//this.spinner.setModel(new SpinnerListModel(new String[] {"Eppe", "Bouclier", " ... "}));
		
		caraPanel = new JPanel();
		
		try {
			cara1 = new PlusMoins("Impact", 20, 50, 20);
			cara2 = new PlusMoins("Parade", 20, 50, 20);
			cara3 = new PlusMoins("Impact", 20, 50, 20);
		} catch (Exception e) {
			e.printStackTrace();
		}
		caraPanel.setLayout(new GridLayout(0, 4, 0, 0));
		
		spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"Epee", "Bouclier", "Remede", "SortDefensif", "..."}));
		
		
		caraPanel.add(spinner);
		
		caraPanel.add(cara1);
		caraPanel.add(cara2);
		caraPanel.add(cara3);
		
		this.add(caraPanel);

		

	}

}