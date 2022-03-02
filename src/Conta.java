public abstract class Conta implements IConta
{
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    
    Conta()
    {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    
    @Override
    public void sacar(double valor){
        
    }

    @Override
    public void depositar(double valor){
        
    }

    @Override
    public void transferir(double valor, Conta destino){
        
    }

    public int getAgencia()
    {
        return agencia;
    }

    public int getNumero()
    {
        return numero;
    }

    public double getSaldo()
    {
        return saldo;
    }


    public void setAgencia(int agencia)
    {
        this.agencia = agencia;
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
