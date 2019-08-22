
package aula2;

import javax.swing.JDialog;
import javax.swing.JFrame;


public class TestarModoExibicao {
    public static void main(String[] args) {
        JFrame janela = new JFrame(); //criação da janela
    janela.setTitle("Modo exibição"); //titulo da janela
    janela.setSize(640, 480); //tamanho da janela
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fechar execução da janela
    janela.setLocationRelativeTo(null);
    janela.setExtendedState(JFrame.MAXIMIZED_BOTH); //janela tela cheia
    janela.setVisible(true); //janela visivel
   
        JDialog janela2 = new    JDialog( janela,false);
    janela2.setTitle("Second Window");
    janela2.setSize(320,240);
    }

   
    
    
    
}
