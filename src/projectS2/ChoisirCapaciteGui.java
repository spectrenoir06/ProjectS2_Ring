package projectS2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("0283b38b-dfae-43c7-a4ed-ff1bda47fbdb")
public class ChoisirCapaciteGui extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@objid ("a565cab3-4284-4a87-be69-f76f3dd2bcca")
    private JPanel contentPane;

    @objid ("021a0c14-e65f-446d-a791-0647a906fa1b")
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ChoisirCapaciteGui frame = new ChoisirCapaciteGui();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @objid ("30acd4d6-f5e5-4921-a30c-a27b6b2344a5")
    public ChoisirCapaciteGui() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
    }

}
