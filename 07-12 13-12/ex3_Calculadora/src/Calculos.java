public class Calculos {
    private double x;
    private double y;
    private double resultado;
    
    public Calculos(){
    }
    public Calculos(double x, double y){
        this.x=x;
        this.y=y;
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
    
    public void Soma(double x, double y){
        this.resultado=x+y;
        System.out.println("Resultado: \n" + x + "+" + y + "=" + this.resultado);
    }
    
    public void Subtracao(double x, double y){
        this.resultado=x-y;
        System.out.println("Resultado: \n" + x + "-" + y + "=" + this.resultado);
    }
    
    public void Multiplicacao(double x, double y){
        this.resultado=x*y;
        System.out.println("Resultado: \n" + x + "x" + y + "=" + this.resultado);
    }
    
    public void Divisao(double x, double y){
        this.resultado=x/y;
        System.out.println("Resultado: \n" + x + "/" + y + "=" + this.resultado);
    }
    
    public void restoDivisao(double x, double y){
        this.resultado=x%y;
        System.out.println("Resultado: \n" + x + "%" + y + "=" + this.resultado);
    }
    
    
}
