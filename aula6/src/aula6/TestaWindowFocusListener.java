package aula6;

import javax.swing.JFrame;



public class TestaWindowFocusListener {
    public static void main(String[] args) {
     OuvinteWindowFocusListener  OuvinteWindowFocusListener = new OuvinteWindowFocusListener();
     
     JFrame janela = new JFrame();
        janela.setTitle("Janela com painéis");
        janela.addWindowFocusListener(OuvinteWindowFocusListener);
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        janela.setVisible(true);
    } 
}
