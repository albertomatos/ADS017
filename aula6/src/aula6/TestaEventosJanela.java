package aula6;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestaEventosJanela {

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(janela, "Dica do dia");
                
              
            }

            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(janela, "Quer sair da aplicação");
            }
        });
       janela.setVisible(true);        
    }
}
