package aula3;

import javax.swing.JOptionPane;

public class TestaJOptionPane {

    private static String valor;
    private static String opcao;
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "ola mundo"); 
        JOptionPane.showInputDialog(null, "Informe um valor");
        JOptionPane.showMessageDialog(null, "O valor informado foi " + valor);
        JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Confirmação", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);
        JOptionPane.showMessageDialog(null, "O sistema estará em manutenção das 23hs a 04hs", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Atenção! Faltou preencher um campo obrigatório.", "Alerta", JOptionPane.WARNING_MESSAGE);
        
        
    }
    
}
