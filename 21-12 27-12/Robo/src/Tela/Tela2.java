
package Tela;


import Robo.Robo;
import javax.swing.JOptionPane;



public class Tela2 {
    private String nome;
    private String x,y, xdirecao,ydirecao;
    private Tela3 tela;
    private Robo robo;
    
    public Tela2(){
        criaTela();
    }

    public void criaTela(){
        
        nome = JOptionPane.showInputDialog("Insira o nome do robô: ");
        x= JOptionPane.showInputDialog("Coordenada x:");
        y= JOptionPane.showInputDialog("Coordenada y:");
        xdirecao= JOptionPane.showInputDialog("Direção X(L,O,N,S):");  
        ydirecao= JOptionPane.showInputDialog("Direção Y(L,O,N,S):");
        
        robo = new Robo(nome,Integer.parseInt(x),Integer.parseInt(y),xdirecao.charAt(0),ydirecao.charAt(0));
        tela = new Tela3(robo);
    }


}

