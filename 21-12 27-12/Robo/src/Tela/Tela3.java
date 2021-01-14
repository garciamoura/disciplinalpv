
package Tela;

import Robo.Robo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela3 extends JFrame implements ActionListener{
   private JPanel painel_principal,painel_componentes, painel_buttons;
   private JButton nova_coordenada, novo_robo;
   private JLabel nome;
   private JLabel x,y, xdirecao,ydirecao;
   private Tela2 tela2;
   private Tela4 tela4;
   private Robo robo;
   
   public Tela3(Robo robo){
       this.robo=robo;
       criaTela(robo.getNome(),robo.getX(),robo.getY(),robo.getDirecaox(), robo.getDirecaoy());
   }   
   
   
   public void criaTela(String nome, int x, int y, char direcaox, char direcaoy){
       painel_componentes = new JPanel();
       painel_buttons = new JPanel();
       painel_principal = new JPanel();
       
       this.nome = new JLabel(nome);
       this.x =new JLabel(String.valueOf(x));
       this.xdirecao = new JLabel(String.valueOf(direcaox));
       this.y=new JLabel(String.valueOf(y));
       this.ydirecao = new JLabel(String.valueOf(direcaoy));
          
       
       this.nome.setText(this.nome.getText().toUpperCase());
       this.x.setText(this.x.getText().toUpperCase());
       this.y.setText(this.y.getText().toUpperCase());
       this.xdirecao.setText(this.xdirecao.getText().toUpperCase());
       this.ydirecao.setText(this.ydirecao.getText().toUpperCase());
       
       
       painel_componentes.add(this.nome);
       painel_componentes.add(this.x);
       painel_componentes.add(this.xdirecao);
       painel_componentes.add(this.y);
       painel_componentes.add(this.ydirecao);
       
       nova_coordenada = new JButton("NOVA COORDENADA");
       nova_coordenada.addActionListener(this);
       
       novo_robo = new JButton("NOVO ROBO");
       novo_robo.addActionListener(this);
       
       painel_buttons.add(nova_coordenada);
       painel_buttons.add(novo_robo);
       
       painel_principal.add(painel_componentes);
       painel_principal.add(painel_buttons);
       add(painel_principal);    
       visibilidadeTela();
      
   }
   
    public void visibilidadeTela(){
     setVisible(true);
     setSize(300,200);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == novo_robo){
           tela2 = new Tela2(); 
        }
        if (ae.getSource() == nova_coordenada){
            tela4 = new Tela4(this.robo);
    }
}
}
