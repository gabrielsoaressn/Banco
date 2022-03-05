public class ContaPoupanca extends Conta
{
    private static final double RENDIMENTO = 1.0668;
    
    void ajustarSaldo(double saldo1)
    {
        this.saldo *= RENDIMENTO;
    }
    
    void chamarMensagemSaque()
    {
        System.out.println("Você não pode sacar. Esta conta é poupança\n");
    }

    void chamarMensagemTranferencia()
    {
        System.out.println("Você não pode transferir. Esta conta é poupança\n");
    }

    public void sacar(double valor)
    {
        chamarMensagemSaque();
    }

    
    public void tranferir(double valor)
    {
        chamarMensagemTranferencia();
    }

    ContaPoupanca(int numero, double saldo)
    {
        this.numero = numero;
        ajustarSaldo(saldo);
    }
    
}