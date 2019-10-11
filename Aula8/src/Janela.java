
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;


public class Janela extends JFrame{
   private JMenuBar barraMenu;
   private JMenu menuArquivo;
   private JMenu menuAjuda;
  private JMenuItem menuArquivoSair;
  private JMenuItem menuAjudaSobre;

    public Janela()  {
        
        barraMenu = new JMenuBar();
        menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic('A');
        
        menuAjuda = new JMenu("Ajuda");
        menuAjuda.setMnemonic('J');
        
        menuArquivoSair = new JMenu("ArquivoSair");
        menuArquivoSair.setMnemonic('Q');
        
        menuArquivoSair = new JMenuItem();
        menuArquivoSair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuArquivoSair.setMnemonic('R');
        
        menuAjudaSobre = new JMenuItem();
        menuAjudaSobre.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Aplicação 1.0 ");
            }
        });
         
        menuAjudaSobre .setMnemonic('S');
        
        menuArquivo.add(menuArquivoSair);
        menuAjuda.add(menuAjudaSobre);
         barraMenu.add(menuArquivo);
        barraMenu.add( menuAjuda);
        
        JFrame janela = new JFrame();
        janela.setSize(600, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
        
    }
  
  

}
