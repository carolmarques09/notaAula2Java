public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(String titular) {
        super(titular);
    }

    public void calcularRendimento(double taxa) {
        double selic = obterTaxaSelic();
        double rendimento;

        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }

        saldo += rendimento;
        System.out.println("Rendimento calculado com sucesso!");
    }

    private double obterTaxaSelic() {
        return 6.7;
    }
}
