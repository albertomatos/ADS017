
package aula6;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class OuvinteWindowStateListener implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("A janela passou de \" + e.getOldState() + \" para \" + e.getNewState()");
    }
    
}
