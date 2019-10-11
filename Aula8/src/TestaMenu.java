
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;


public class TestaMenu {
    public static void main(String[] args) {
        JMenuBar barraMenu = new JMenuBar();
      
        JMenu menu = new JMenu();
        
        JMenu menuItemMenu = new JMenu("ItemMenu 1");
        menu.add(menuItemMenu);
        menu.addSeparator();
        
        JMenu menuItemMenu2 = new JMenu("ItemMenu 1");
        menu.add(menuItemMenu2);
        menu.setEnabled(false);
        
         JFrame janela = new JFrame();
        janela.setJMenuBar(barraMenu);
        janela.setSize(600, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        
    }
   
            
}
