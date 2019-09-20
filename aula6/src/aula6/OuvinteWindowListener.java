package aula6;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OuvinteWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Janela aberta");
    }

    @Override
    public void windowClosing (WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Janela fechada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Janela minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Janela restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Janela ativa");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Janela inativa");
    }
};


