
package aula6;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;


public class OuvinteWindowFocusListener implements WindowFocusListener {

    @Override
    public void windowGainedFocus(WindowEvent e) {
        System.out.println("Janela ganhou o foco");
    }

    @Override
    public void windowLostFocus(WindowEvent e) {
        System.out.println("Janela perdeu o foco");
    }
    
}
