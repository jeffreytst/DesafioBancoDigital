package DesafioBancoDigital;

public class Extrato {

    private Conta contaOrigem;
    private double valorTransacao;
    private Conta contaDestino;
    private String status;

    public Extrato(Conta contaOrigem, double valorTransacao, Conta contaDestino, String status) {
        this.contaOrigem = contaOrigem;
        this.valorTransacao = valorTransacao;
        this.contaDestino = contaDestino;
        this.status = status;
    }

    public Extrato(Conta contaOrigem, double valorTransacao, String status) {
        this.contaOrigem = contaOrigem;
        this.valorTransacao = valorTransacao;
        this.status = status;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Extrato{" +
                "contaOrigem=" + contaOrigem.getTitular().getNome() +
                ", valorTransacao=" + valorTransacao +
                ", contaDestino=" + (contaDestino != null ? contaDestino.getTitular().getNome() : "N/A") +
                ", status='" + status + '\'' +
                '}';
    }
}
