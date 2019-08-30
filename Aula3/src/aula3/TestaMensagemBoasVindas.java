package aula3;

import javax.swing.JOptionPane;

public class TestaMensagemBoasVindas {

    public static String nome;

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?");
        if (opcao == JOptionPane.YES_OPTION) {
            nome = JOptionPane.showInputDialog("Informe seu nome");
            if (nome != null) {
                JOptionPane.showMessageDialog(null, "bem vindo " + nome);
            } else {
                JOptionPane.showMessageDialog(null, "você não digitou seu nome", "Erro", JOptionPane.ERROR_MESSAGE);
            }
           
        }
        else {
        JOptionPane.showMessageDialog(null, "O programa foi encerrado.", "alerta" , JOptionPane.WARNING_MESSAGE);
        }

    }

}
