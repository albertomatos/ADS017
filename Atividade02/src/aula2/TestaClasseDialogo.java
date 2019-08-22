
package aula2;

import javax.swing.JDialog;

public class TestaClasseDialogo {
    public static void main(String[] args) {
        JDialog janela = new JDialog(); //criação da janela
    janela.setTitle("caixa de dialogo"); //titulo da janela
    janela.setSize(320,240); //tamanho da janela
    janela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); //fechar execução da janela
    janela.setLocationRelativeTo(null);
    //janela.setExtendedState(JDialog.MAXIMIZED_BOTH); //janela tela cheia
    janela.setVisible(true); //janela visivel
    }
}
