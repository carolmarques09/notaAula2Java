public class ContaCorrente extends ContaBancaria {
    double limiteChequeEspecial = 1000.0;

    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial(double valor) {
        if (saldo + limiteChequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Uso do cheque especial feito com sucesso!");
        } else {
            System.out.println("Limite do cheque especial excedido!");
        }
    }
}
