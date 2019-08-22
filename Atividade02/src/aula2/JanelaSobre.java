
package aula2;

import java.awt.Frame;
import java.util.Locale;
import javax.swing.JDialog;


public class JanelaSobre extends JDialog{

    public JanelaSobre(Frame owner, boolean modal) {
        super(owner, modal);
    }
        
    public void exibir() {
        setSize(320,240); //tamanho da janela
        setTitle("Sobre"); //titulo da janela
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    
}
