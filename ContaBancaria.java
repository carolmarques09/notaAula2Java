public class ContaBancaria {

    String titular;
    double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Seu saldo é insuficiente!");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
