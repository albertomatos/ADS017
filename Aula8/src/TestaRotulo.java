
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class TestaRotulo {
    public static void main(String[] args) {
       
      
      JLabel rotulo = new JLabel();
      rotulo.setText("Um texto não editável");
      rotulo.setToolTipText("Rótulo 1!");
      
      JLabel rotulo1 = new JLabel();
      rotulo.setText("Este rótulo está inativo");
      rotulo.setToolTipText("Rótulo 2!");
      rotulo1.setEnabled(false);
     
      JFrame janela = new JFrame();
        janela.add(rotulo,BorderLayout.NORTH);
         janela.add(rotulo1,BorderLayout.SOUTH);
        janela.setSize(600, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
}
