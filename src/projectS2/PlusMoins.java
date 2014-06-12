package projectS2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1b36eaa9-c1e8-42da-b90e-2c817c837b62")
public class PlusMoins extends JPanel {
    @objid ("e48ae537-7e1e-4353-8d5c-b8f7f9ca6750")
    private static final long serialVersionUID = 1L;

    @objid ("08973459-d99c-4eb9-a246-0910197b777a")
    private int bornMoins;

    @objid ("ce8f1ead-6a6f-4d48-b0a4-b209a8299d03")
    private int bornPlus;

    @objid ("f522ce3a-d4d0-4769-a445-42a6a3b5fe09")
    private int nb;

    @objid ("4b02878c-1d08-454f-a3cf-2304dc813576")
    private boolean isOn;

    @objid ("50512f2c-3dc7-424e-82d1-e0a6a43e2e4f")
    private JButton bPlus;

    @objid ("910ea371-8d1c-4ccf-bf50-8d65fb9b99b6")
    private JButton bMoins;

    @objid ("e02bde2d-737f-484c-b272-c47d91058d51")
    private JLabel labelText;

    @objid ("b7f34940-ce67-4646-9db0-7395a025142f")
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

    @objid ("39c6a88e-4f1d-40ad-bc0d-3638c8a6b75d")
    public int getNb() {
        return this.nb;
    }

    @objid ("d1d9408d-238a-4413-ad5b-925e9eedd1f2")
    public void reBorne() {
        bMoins.setEnabled(nb > bornMoins);
        bPlus.setEnabled(nb < bornPlus);
        labelText.setText(nb + "");
    }

    @objid ("73054841-aa0e-4299-9d1f-a99311c500aa")
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

    @objid ("8d06b93f-3bc4-4f21-913c-2fa4ada867bf")
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

    @objid ("b9987a91-cf29-4387-a3f2-8efa8204753e")
    public void setUse(boolean isOn) {
        this.isOn = isOn;
        if(isOn){
            reBorne();
        }else{
            bMoins.setEnabled(false);
            bPlus.setEnabled(false);
        }
    }

}
