
package aula3;


import com.sun.glass.ui.Cursor;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;


public class TestaJanelaComRolagem {
    public static void main(String[] args) {
        JPanel painelComum = new JPanel();
        
        painelComum.setBorder(BorderFactory.createLineBorder(Color.blue));
       painelComum.setPreferredSize(new Dimension(800,600));
       
       JScrollPane painelRolagem = new JScrollPane();
       painelRolagem.setViewportView(painelComum);
       JFrame janela = new JFrame();
     janela.add(painelRolagem);
     
    
       painelComum.setPreferredSize(new Dimension(640,480));
      janela.setSize(200,100);
       janela.setVisible(true);
       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
     
    }
}
