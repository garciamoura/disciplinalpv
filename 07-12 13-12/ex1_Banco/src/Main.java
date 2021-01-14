public class Main {
   public static void main(String[] args) {
       ContaBancaria conta1 = new ContaBancaria(1,"Gabriela",100);
       System.out.println("Saldo: " + conta1.getSaldo());
       conta1.Depositar(200);
       System.out.println("Saldo: " + conta1.getSaldo());
       conta1.Sacar(50);
       System.out.println("Saldo: " + conta1.getSaldo());
       conta1.Sacar(500);
       conta1.ConsultaConta();
       
}
 
}
