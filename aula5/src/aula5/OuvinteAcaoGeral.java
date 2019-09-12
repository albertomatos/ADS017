
package aula5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuvinteAcaoGeral implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Acionou o comando " + e.getActionCommand() + "do componente " + e.getSource().getClass());
    }
    
}
