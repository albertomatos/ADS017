package aula5;

import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class TestaOuvinteComum {
    public static void main(String[] args) {
        OuvinteComum ouvinte = new OuvinteComum();
        
        JButton botao = new JButton("OK");
        botao.addActionListener(ouvinte);
        
        JPanel painel = new JPanel();
        painel.add(botao);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}