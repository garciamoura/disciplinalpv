
package jogo;

import java.io.IOException;
import java.io.Serializable;

public class Jogo implements Serializable{
    public static final int MAX_TENTATIVAS = 3;
    private int tentativas;
    private int dado1;
    private int dado2;
    private int soma;
    private String nomeJogador;

    public int getDado1() {
        return dado1;
    }
    
    public int getTentativas(){
        return this.tentativas;
    }

    public int getDado2() {
        return dado2;
    }

    public int getSoma() {
        return this.soma;
    }
  

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    
    public double lancarDados(){
        dado1 =  this.getAleatorioFaixa(1, 6);
        dado2 = this.getAleatorioFaixa(1, 6);
        soma =  dado1 + dado2;
        return this.soma;
    }
    
    public boolean adivinharSoma(int adivinhacao){
        boolean retorno = adivinhacao == this.getSoma();
        if(!retorno){
            this.tentativas++;
        }
        
        return retorno;
    }

    
    public void salvarJogo(String caminho) throws IOException{
        arquivp.gravar(this, caminho);
    }
    
    public int getAleatorioFaixa(int min, int max){
        return (int) ((Math.random()* (max - min)) + min);
    }
    
    public static Jogo recuperarJogo(String caminho) throws IOException, ClassNotFoundException{
        return arquivp.ler(caminho);
    }
    
    
}
