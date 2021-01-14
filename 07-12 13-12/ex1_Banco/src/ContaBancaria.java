public class ContaBancaria {
    private double codigo;
    private String nomeCliente;
    private double saldo;
    
    public ContaBancaria(double codigo, String nomeCliente,double saldo){
        this.codigo=codigo;
        this.nomeCliente=nomeCliente;
        this.saldo=saldo;
    }

    public double getCodigo() {
        return codigo;
    }

    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Depositar(double saldo){
        this.saldo+=saldo;
    }
    
    public boolean Sacar(double saldo){
        if((this.saldo>saldo) & (saldo>0)){
            this.saldo-=saldo;
            return true;
        }else{
            System.out.println("Saldo insuficiente");
            return false;
        }
            
    }
    
    public void ConsultaConta(){
        System.out.println("-----------------------\n"
                + "Conta: " + this.codigo + "\n"
                + "Cliente: " + this.nomeCliente + "\n"
                + "Saldo: " + this.saldo);
        
    }
}
