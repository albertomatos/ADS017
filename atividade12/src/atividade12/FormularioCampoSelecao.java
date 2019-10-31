
package atividade12;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class FormularioCampoSelecao extends JFrame {
    JComboBox comboUF = new JComboBox();
    JList listaMunicipio = new JList();
    
String[]  arrayUF ={};
String[][]  arrayMunicipio ={};

    public FormularioCampoSelecao() throws HeadlessException {
        arrayUF = new String[] {"DF","GO"};
        arrayMunicipio = new String[][] {{"Brasília", "Taguatinga", "Sobradinho"},{"Formosa", "Planaltina", "Valparaiso"}};
        comboUF = new   JComboBox (arrayUF);
        listaMunicipio = new JList(arrayMunicipio [0]);
        listaMunicipio.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        comboUF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               listaMunicipio.setListData(arrayMunicipio[comboUF.getSelectedIndex()]);
            }
        });
        JLabel rotuloUf = new  JLabel("Seleciona a UF:");
        JLabel rotuloMunicipio = new  JLabel("Selecione o Município");
        
        
        JPanel painel = new JPanel();
        
        painel.add(rotuloUf);
        painel.add(comboUF);
        painel.add(rotuloMunicipio);
        painel.add(listaMunicipio );
        add(painel);
        
        
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
        
        
       
    }


}