
package Tela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela1 extends JFrame implements ActionListener{
    private JPanel painel_principal,painel_button;
    private JButton botao1; 
    private String nome;
    private Tela2 tela2;
    
 public Tela1(){
     criaTela();
     visibilidadeTela();
 }


 public void criaTela(){
     
     botao1 = new JButton("CRIAR ROBÔ");
     botao1.addActionListener(this);
     
     painel_button = new JPanel();
     painel_principal = new JPanel();
     
     painel_button.add(botao1);
     painel_principal.add(painel_button);
     
     add(painel_principal);
     
 }
 
 public void visibilidadeTela(){
     setVisible(true);
     setSize(300,100);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == botao1){
            tela2 = new Tela2();    
    }

}
}