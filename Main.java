package DesafioBancoDigital;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jeffrey");

        Conta conta = new ContaPoupanca(cliente);
        Conta conta2 = new ContaCorrente(new Cliente("joazao"));

        conta.depositar(400);
        conta.transferir(100, conta2);

        conta.extratoExibir();
    }
}
