package Tela;

import Calculadora.Calculadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Tela1 extends JFrame implements ActionListener{
   private JPanel painel_principal, painel_buttons, painel_componentes;
   private JButton soma, subtracao, divisao, multipl, div_resto;
   private JLabel result,result1 = null;
   private Calculadora calc;
   
   public Tela1(){
       criaTela();
   }
   
   public void criaTela() {
       painel_principal= new JPanel();
       painel_buttons = new JPanel();
       painel_componentes = new JPanel();
       
       result= new JLabel("RESULTADO: ");
       result1 = new JLabel("");
       
       painel_componentes.add(result);
       painel_componentes.add(result1);
       soma = new JButton("SOMA");
       soma.addActionListener(this);
       subtracao = new JButton("SUBTRAÇÃO");
       subtracao.addActionListener(this);
       divisao = new JButton("DIVISÃO");
       divisao.addActionListener(this);
       multipl = new JButton("MULTIPLICAÇÃO");
       multipl.addActionListener(this);
       div_resto = new JButton("DIV_RESTO");
       div_resto.addActionListener(this);
       
       painel_buttons.add(soma);
       painel_buttons.add(subtracao);
       painel_buttons.add(divisao);
       painel_buttons.add(multipl);
       painel_buttons.add(div_resto);
       painel_principal.add(painel_componentes);
       painel_principal.add(painel_buttons);
       add(painel_principal);
       visibilidadeTela();
   }
   
    public void visibilidadeTela(){
     setVisible(true);
     setSize(600,130);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void informaValor(){
        Calculadora calc_arg = new Calculadora();
        calc_arg.setX(Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor: ")));
        calc_arg.setY(Integer.parseInt(JOptionPane.showInputDialog("Segundo Valor: ")));
        calc=calc_arg;
        
    }
    public void mostraResultado(){
        result1.setText(String.valueOf(calc.getResultado()));
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == soma){
            informaValor();
            calc.Soma();
            mostraResultado();
        }if(ae.getSource() == subtracao){
            informaValor();
            calc.Subtracao();
            mostraResultado();
        }if(ae.getSource() == divisao){
            informaValor();
            calc.Divisao();
            mostraResultado();
        }if(ae.getSource() == multipl){
            informaValor();
            calc.Multiplicacao();
            mostraResultado();
        }if(ae.getSource() == div_resto){
            informaValor();
            calc.restoDivisao();
            mostraResultado();
        }
    }
}
