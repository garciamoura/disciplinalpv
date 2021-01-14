
package jogo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Anevnessa
 */
public class arquivp {
    private File file;
    private String caminho;
    
    public arquivp(String caminho) {
            file = new File(caminho);
            this.caminho = caminho;
    }
    
    public void escreverArquivo(String texto) throws IOException {
        FileWriter arq = new FileWriter(this.caminho);
        BufferedWriter buf = new BufferedWriter(arq);
        buf.append(texto);
        buf.close();
    }
    
    public String lerArquivoTexto() throws IOException{
        FileReader arq = new FileReader(this.caminho);
        BufferedReader buf = new BufferedReader(arq);
	String texto = "";
        String linha;
        
        while (buf.ready()) {
            linha = buf.readLine();
            
            if(linha != null && !linha.trim().isEmpty()){
                texto = texto + linha + "\n" ;
            }
        }
        buf.close();
        return texto;
    }
    
    public static void gravar(Jogo jogo, String caminho) throws IOException{
        FileOutputStream arquivoSaida = null;
        ObjectOutputStream objetoSaida = null;
        try{
            arquivoSaida = new FileOutputStream(caminho,false);
            objetoSaida = new ObjectOutputStream(arquivoSaida);
            objetoSaida.writeObject(jogo);
            objetoSaida.flush();
        }finally{
            objetoSaida.close();
            arquivoSaida.close();
        }
    }
    
    public static Jogo ler(String caminho) throws IOException, ClassNotFoundException{
        Jogo jogo = null;
        FileInputStream arquivoEntrada = null;
        ObjectInputStream objetoEntrada = null;
        try{
            arquivoEntrada = new FileInputStream(caminho);
            objetoEntrada = new ObjectInputStream(arquivoEntrada);
            
            if(arquivoEntrada.available() > 0){
                jogo = (Jogo)objetoEntrada.readObject();
            }
        }finally{
            objetoEntrada.close();
            arquivoEntrada.close();
        }
        return jogo;
    }
    
    
}
