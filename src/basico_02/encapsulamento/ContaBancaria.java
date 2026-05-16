package basico_02.encapsulamento;

public class ContaBancaria {

    private int agencia;
    private int conta;
    private double saldo;

    public ContaBancaria(int agencia, int conta) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0.0;
    }

    public void depositar(double entrada){
        if(entrada < 0){
            throw new IllegalArgumentException("Valor de depósito não pode ser negativo.");
        }
        this.saldo += entrada;
    }

    public void sacar(double saida){
        if(saldo < saida ){
            throw new IllegalArgumentException("Saldo insuficiente para saque.");
        }
        this.saldo-=saida;
    }

    public double consultarSaldo(){return this.saldo;}
}
