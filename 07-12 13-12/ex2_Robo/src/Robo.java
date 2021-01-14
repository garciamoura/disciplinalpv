public class Robo {
    private String nome;
    private int x;
    private int y;
    private char direcao;
    private char direcaox,direcaoy;
    
    public Robo(String nome, int x, int y, char direcao){
        this.nome = nome;
        this.x=x;
        this.y=y;
        this.direcao=direcao;
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
    
    public void calculaX(int x, char direcao){
        switch(direcao){
            case 'L': this.x+=x;this.direcaox=direcao;break;
            case 'O': this.x-=x;this.direcaox=direcao;break;
        }
    }
    
    public void calculaY(int y, char direcao){    
        switch(direcao){
            case 'N': this.y+=y;this.direcaoy=direcao;break;
            case 'S': this.y-=y;this.direcaoy=direcao;break;
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
