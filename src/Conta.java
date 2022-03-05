public abstract class Conta
{
    protected static int SEQUENCIAL = 0;
    protected int numero;
    protected double saldo;    
    
    public void sacar(double valor){
        saldo-=valor;
    }

    public void depositar(double valor){
        saldo+=valor;        
    }

    public void transferir(double valor, Conta destino){
        destino.depositar(valor);
        this.sacar(valor);
    }
    protected void imprimirExtrato()
    {
        System.out.println("---------------------EXTRATO---------------------");
        imprimirAtributos();
    }
    
    private void imprimirAtributos()
    {
        System.out.println("NUMERO DA CONTA : " + this.numero + "\n" +
        "SALDO: R$"+this.saldo + "\n" +
        "----------------------------------------------------");
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
}
