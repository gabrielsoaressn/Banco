public interface IConta
{
    void sacar(int valor);
    void depositar(int valor);
    void tranferir(int valor, Conta destino);
}
