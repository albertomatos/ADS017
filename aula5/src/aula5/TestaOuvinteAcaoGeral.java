package aula5;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JTextField;

public class TestaOuvinteAcaoGeral {
    public static void main(String[] args) {
        OuvinteAcaoGeral ouvinte = new OuvinteAcaoGeral();
        
        JButton botao = new JButton("OK");
        
        JTextField campo = new JTextField(30);
        botao.addActionListener(ouvinte);
        campo.addActionListener(ouvinte);
        
        JFrame janela = new JFrame();
        janela.setLayout(new FlowLayout());
        janela.setSize(800, 600);
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.add(botao);
        janela.add(campo);
    }
}