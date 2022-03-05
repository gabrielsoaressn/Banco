public class Clientecp extends Cliente {
     //c - corrente, p - poupança
     char tipo;
     Clientecp(String nome, Conta contaCliente, char tipo)
     {
        this.nome = nome;
        this.contaCliente = contaCliente;
        this.tipo = 'p';
     }
}
