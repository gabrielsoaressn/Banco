public class App {
    public static void main(String[] args) throws Exception {
        Conta cc1 = new ContaCorrente();
        cc1.depositar(300);
        
        
        cc1.imprimirExtrato();

    }
}