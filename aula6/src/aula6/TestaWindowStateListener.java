
package aula6;

import javax.swing.JFrame;


public class TestaWindowStateListener {
    public static void main(String[] args) {
        OuvinteWindowStateListener ouvinteWindowStateListener = new OuvinteWindowStateListener();
        
        JFrame janela = new JFrame();
        janela.setTitle("Janela com painéis");
        janela.addWindowStateListener(ouvinteWindowStateListener);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janela.setVisible(true);
    }
}
