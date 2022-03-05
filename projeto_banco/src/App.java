public class App {
    public static void main(String[] args) throws Exception {
        Conta cc1 = new ContaCorrente();
        cc1.depositar(300);
        
        cc1.transferir(100, poupa1);
        
        cc1.imprimirExtrato();

    }
}