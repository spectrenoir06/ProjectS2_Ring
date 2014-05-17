package projectS2;

import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.*;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("f47f236e-7f98-4cf3-b00e-82dd6ce111b9")
public class jCapacite extends JPanel {
    @objid ("9484930d-a83f-4eaa-a78e-15568776b2ec")
    private static final long serialVersionUID = 1L;

    @objid ("d2269df9-1a03-439f-aabe-21dcaaf6cbff")
    private JPanel caraPanel;

    @objid ("163fd0f4-112b-4bd8-bace-cfff4cbfa816")
    private PlusMoins cara1;

    @objid ("4cca9bcf-f819-4a75-899d-e5d9c9868526")
    private PlusMoins cara2;

    @objid ("3d0bf266-3884-4514-ad80-e88ddaedd9b7")
    private PlusMoins cara3;

    @objid ("fbe700dc-5876-4648-a64b-d931c5a891e3")
    private JSpinner spinner;

    @objid ("4377df64-6a9a-4601-b8d3-6e345de778c7")
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
