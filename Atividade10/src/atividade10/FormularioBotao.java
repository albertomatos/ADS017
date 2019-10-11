package atividade10;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class FormularioBotao extends JFrame {
    
    int quantidadeCursos = 0;
    JButton salvar = new JButton("salvar");
    JButton fechar = new JButton("fechar");
    JLabel rotulo1 = new JLabel("Selecione até duas opções de curso:");
    JLabel rotulo2 = new JLabel("Deseja cursar com bolsa de estudo?");
    ButtonGroup group = new ButtonGroup();
    
    JCheckBox checkCursoAds = new JCheckBox("Análise e Desenvolvimento de Sistemas");
    JCheckBox checkCursoSegInf = new JCheckBox("Segurança da Informação");
    JCheckBox checkCursoJogos = new JCheckBox("Jogos Digitais");
    JCheckBox checkCursoRedes = new JCheckBox("Redes de Computadores");
    
    JRadioButton radioBolsaIntegral100 = new JRadioButton("Integral 100%");
    JRadioButton radioBolsaParcial75 = new JRadioButton("Parcial 75%");
    JRadioButton radioBolsaParcial50 = new JRadioButton("Parcial 50%");
    JRadioButton radioBolsaParcial25 = new JRadioButton("Parcial 25%");
    JRadioButton radioSemBolsa = new JRadioButton("Sem Bolsa");
    
    JPanel painel = new JPanel();
    JPanel painelCentral = new JPanel();
    GridLayout leiaute = new GridLayout(11, 1);
    
    public FormularioBotao() throws HeadlessException {
        painel.add(salvar);
        painel.add(fechar);
        
        painelCentral.setLayout(leiaute);
        painelCentral.add(rotulo1);
        painelCentral.add(checkCursoAds);
        painelCentral.add(checkCursoSegInf);
        painelCentral.add(checkCursoJogos);
        painelCentral.add(checkCursoRedes);
        painelCentral.add(rotulo2);
        painelCentral.add(radioBolsaIntegral100);
        painelCentral.add(radioBolsaParcial75);
        painelCentral.add(radioBolsaParcial50);
        painelCentral.add(radioBolsaParcial25);
        painelCentral.add(radioSemBolsa);
        add(painelCentral);
        add(painel, BorderLayout.SOUTH);
        
        group.add(radioBolsaIntegral100);
        group.add(radioBolsaParcial75);
        group.add(radioBolsaParcial50);
        group.add(radioBolsaParcial25);
        group.add(radioSemBolsa);
        
        ActionListener ouvinte = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox checkBox = (JCheckBox) e.getSource();
                
                if (checkBox.isSelected()) {
                    quantidadeCursos++;
                } else {
                    quantidadeCursos--;
                }
                if (quantidadeCursos > 2) {
                    quantidadeCursos--;
                    checkBox.setSelected(false);
                }
                
            }
        };
        checkCursoAds.addActionListener(ouvinte);
        checkCursoJogos.addActionListener(ouvinte);
        checkCursoRedes.addActionListener(ouvinte);
        checkCursoSegInf.addActionListener(ouvinte);
        fechar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        radioSemBolsa.setSelected(true);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
