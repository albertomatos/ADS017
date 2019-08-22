package aula2;

import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame {

    private JanelaSobre janelaSobre;

    public JanelaPrincipal() {
        super();
        janelaSobre = new JanelaSobre(this, true);
    }

    public void exibir() {
        setSize(640, 480); //tamanho da janela
        setTitle("Aplicação GUI"); //titulo da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setVisible(true);
        janelaSobre.exibir();
    }

}


