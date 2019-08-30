package aula3;

import javax.swing.JOptionPane;

public class TestaCaixaMensagemCustomizada {

   

    public static void main(String[] args) {
        Object[] nomes = {"Java", ".Net", "Php"};
        int opcao = JOptionPane.showOptionDialog(null,
                "Qual a linguagem de programação que você prefere trabalhar?",
                "enquete",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                nomes,
                nomes[0]);
        JOptionPane.showMessageDialog(null, "A opção escolhida foi " + opcao);

    }

}
