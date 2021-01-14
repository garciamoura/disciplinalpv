
package Calculadora;

public class Calculadora {
    private double x;
    private double y;
    private double resultado;
    
    public Calculadora(){
    }
    public Calculadora(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void Soma(){
        this.resultado=x+y;
    }
    
    public void Subtracao(){
        if((x<0) & (y<0)){
            this.resultado=x+y;
        }else
        this.resultado=x-y;
    }
    
    public void Multiplicacao(){
        this.resultado=x*y;
    }
    
    public void Divisao(){
        this.resultado=x/y;
    }
    
    public void restoDivisao(){
        this.resultado=x%y;
    }
    
    
}

