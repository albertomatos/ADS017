
package atividade12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FormularioTabela extends JFrame{
    
    
    JTextField campoFiltro = new JTextField();
    JButton botaoFiltrar = new JButton();
    JButton botaoLimpar = new JButton();
    JTable tabela = new JTable();
    
    String[][] arrayDados;
    String[]  arrayColunas;

    public FormularioTabela() throws HeadlessException {
        arrayDados = new String[][] {{"2015001","João","joao@iesb.br"}, {"2015002","Ana","ana@iesb.com"}, {"2015003","Pedro","pedro@iesb.com"}, {"2015004","Bianca","bianca@iesb.com"}, {"2015005","maria","maria@iesb.com"}};
        botaoFiltrar = new JButton("Filtrar");
        botaoLimpar = new JButton("limpar");
       arrayColunas = new String[] {"Matrícula","Nome","E-mail"};
        campoFiltro = new JTextField (20);
        JLabel rotulo1 = new  JLabel( "Informe um nome:");
        DefaultTableModel modelo = new DefaultTableModel(arrayDados, arrayColunas);
        tabela = new JTable(modelo);
        JScrollPane rolagem = new JScrollPane();
        rolagem.setViewportView(tabela);
        JPanel painel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        painel.add(rotulo1);
        painel.add(botaoFiltrar);
        painel.add(botaoLimpar);
        painel.add(campoFiltro);
        botaoLimpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
         DefaultTableModel  modelo = new DefaultTableModel(arrayDados, arrayColunas);
             tabela.setModel(modelo);
            }
    
    });
        botaoFiltrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              DefaultTableModel model = (DefaultTableModel) tabela.getModel();
              modelo.setNumRows(0);
                for (String[] linha : arrayDados) {
                    if(linha[1].contains(campoFiltro.getText())){
                    modelo.addRow(linha);
                    }
                        
                }
            }
        });
        
        
        add(rolagem);
        add(painel, BorderLayout.NORTH);
        
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }

    
}
