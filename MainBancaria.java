import java.util.Scanner;

public class MainBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do titular da conta: ");
        String titular = sc.nextLine();

        System.out.println("Qual o tipo de conta? (1 - Corrente, 2 - Poupança)");
        int tipoConta = sc.nextInt();

        ContaBancaria conta;

        if (tipoConta == 1) {
            conta = new ContaCorrente(titular);
        } else {
            conta = new ContaPoupanca(titular);
        }

        int opcao;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            if (conta instanceof ContaCorrente) {
                System.out.println("3. Usar cheque especial");
            } else {
                System.out.println("3. Calcular rendimento");
            }
            System.out.println("4. Exibir dados da conta");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor a depositar: ");
                    double valorDeposito = sc.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Valor a sacar: ");
                    double valorSaque = sc.nextDouble();
                    conta.depositar(valorSaque);
                    break;
                case 3:
                    if (conta instanceof ContaCorrente) {
                        System.out.println("Valor a utilizar do cheque especial: ");
                        double valorChequeEspecial = sc.nextDouble();
                        ((ContaCorrente) conta).usarChequeEspecial(valorChequeEspecial);
                    } else {
                        System.out.println("Taxa de rendimento: ");
                        double taxa = sc.nextDouble();
                        ((ContaPoupanca) conta).calcularRendimento(taxa);
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
            }
        } while (opcao != 0);
    }
}
