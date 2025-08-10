package DesafioBancoDigital;

import java.util.ArrayList;
import java.util.List;

public class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 10;
    private static int NUMERO_SEQUENCIAL = 1;

    private int agencia;
    private int numeroConta;
    private double saldo;
    private Cliente titular;
    private List<Extrato> extratos;

    public Conta(Cliente titular) {
        this.agencia = AGENCIA_PADRAO;
        this.numeroConta = NUMERO_SEQUENCIAL++;
        this.saldo = 0;
        this.titular = titular;
        this.extratos = new ArrayList<>();
    }
    public Cliente getTitular() {
        return titular;
    }


    @Override
    public void depositar(double valor) {
        saldo += valor;
        Extrato extrato = new Extrato(this, valor, "Depositado");
        extratos.add(extrato);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        Extrato extrato = new Extrato(this, valor, "Sacado");
        extratos.add(extrato);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.saldo -= valor;
        destino.depositar(valor);
        Extrato extrato = new Extrato(this, valor, destino, "Transferido");
        extratos.add(extrato);
    }

    public void extratoExibir() {
        for (Extrato extrato : extratos) {
            System.out.println(extrato.toString());
        }
    }
}
