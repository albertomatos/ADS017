
package aula6;

import javax.swing.JFrame;  

public class TestaWindowListener {
    public static void main(String[] args) {
        OuvinteWindowListener OuvinteWindowListener = new OuvinteWindowListener();
   
     JFrame janela = new JFrame();
        janela.setTitle("Janela com painéis");
        janela.addWindowListener(OuvinteWindowListener);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janela.setVisible(true);
    
    
    
    
    
    }
}
