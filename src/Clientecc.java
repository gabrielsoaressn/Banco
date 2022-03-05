public class Clientecc extends Cliente{
    //c - corrente, p - poupanca
    char tipo;
    Clientecc(String nome, Conta contaCliente, char tipo)
    {
        this.nome = nome;
        this.contaCliente = contaCliente;
        this.tipo = 'c';
    }
}
