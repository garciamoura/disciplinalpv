
package Tela;

import Robo.Robo;
import javax.swing.JOptionPane;

public class Tela4 {
   private String x,y;
   private String xdirecao,ydirecao;
   private Robo robo;
   private Tela3 tela3;
   
   
   public Tela4(Robo robo){
       this.robo=robo;
       criaTela();
    }

    public void criaTela(){
        
        x= JOptionPane.showInputDialog("Coordenada x:");
        xdirecao= JOptionPane.showInputDialog("Direção(L,O,N,S):"); 
        y= JOptionPane.showInputDialog("Coordenada y:");
        ydirecao= JOptionPane.showInputDialog("Direção(L,O,N,S):"); 
        
        robo.calculaX(Integer.parseInt(x),xdirecao.charAt(0));
        robo.calculaY(Integer.parseInt(y),ydirecao.charAt(0));
        
        tela3= new Tela3(robo);
        
    }
    
    
}
