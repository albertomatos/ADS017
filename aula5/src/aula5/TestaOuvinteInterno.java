
package aula5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class TestaOuvinteInterno {
    static class OuvinteInterno implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("actionPerformed disparado...");
        }
        
        public static void main(String[] args) {
            OuvinteInterno ouvinte = new OuvinteInterno();
            JButton botao = new JButton();
            botao.addActionListener(ouvinte);
            
            JPanel painel = new JPanel();
            botao.add(painel);
            
            JFrame janela = new JFrame();
            janela.add(painel);
            janela.setSize(800, 600);
            janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
            janela.setVisible(true);
        }
        
    }
}
