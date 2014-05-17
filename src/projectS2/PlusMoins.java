package projectS2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class PlusMoins extends JPanel {
    
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	private int bornMoins;
    private int bornPlus;
    private int nb;
    private boolean isOn;
    private JPanel panel;
    private JButton bPlus;
    private JButton bMoins;
    private JLabel labelText;

     
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

     public void setUse(boolean isOn) {
        this.isOn = isOn;
        if(isOn){
            reBorne();
        }else{
            bMoins.setEnabled(false);
            bPlus.setEnabled(false);
        }
    }
    public void reBorne() {
        bMoins.setEnabled(nb > bornMoins);
        bPlus.setEnabled(nb < bornPlus);
        labelText.setText(nb + "");
    }
    
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
    public int getNb() {
        return this.nb;
    }

}