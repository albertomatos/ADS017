package aula5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

public class TestaOuvinteAnonimo {
    public static void main(String[] args) {
        JButton botao = new JButton();
        botao.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e) {System.out.println("actionPerformed disparado...");} });
        
        JPanel painel = new JPanel();
        painel.add(botao);
        
        JFrame janela = new JFrame();
        janela.add(painel);
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}