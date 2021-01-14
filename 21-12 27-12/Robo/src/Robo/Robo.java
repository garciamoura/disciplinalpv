package Robo;

public class Robo {
    private String nome;
    private int x;
    private int y;
    private char direcao;
    private char direcaox,direcaoy;
    
    public Robo(String nome, int x, int y, char direcaox, char direcaoy){
        this.nome = nome;
        this.x=x;
        this.y=y;
        this.direcaox=direcaox;
        this.direcaoy=direcaoy;
    }

    public Robo() {
        }

    public char getDirecaox() {
        return direcaox;
    }

    public void setDirecaox(char direcaox) {
        this.direcaox = direcaox;
    }

    public char getDirecaoy() {
        return direcaoy;
    }

    public void setDirecaoy(char direcaoy) {
        this.direcaoy = direcaoy;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getDirecao() {
        return direcao;
    }

    public void setDirecao(char direcao) {
        this.direcao = direcao;
    }
    
    public void calculaX(int x, char direcaox){
        switch(direcaox){
            case 'L': this.x+=x;this.direcaox=direcaox;break;
            case 'O': this.x-=x;this.direcaox=direcaox;break;
            case 'l': this.x+=x;this.direcaox=direcaox;break;
            case 'o': this.x-=x;this.direcaox=direcaox;break;
        }
    }
    
    public void calculaY(int y, char direcaoy){    
        switch(direcaoy){
            case 'N': this.y+=y;this.direcaoy=direcaoy;break;
            case 'S': this.y-=y;this.direcaoy=direcaoy;break;
            case 'n': this.y+=y;this.direcaoy=direcaoy;break;
            case 's': this.y-=y;this.direcaoy=direcaoy;break;
        }
    }
    
    public void mostraCoordenada(){
        System.out.println("Coordenada atual: \n"
                + "X: " + this.x + this.direcaox + "\n"
                + "Y: " + this.y + this.direcaoy );
    }
    
    public void mostraRobo(){
        System.out.println("Nome: " +this.nome + "\n");
        System.out.println("Coordenada atual: \n"
                + "X: " + this.x + this.direcaox + "\n"
                + "Y: " + this.y + this.direcaoy );
    }
}
