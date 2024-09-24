import java.util.Scanner;

public class MainCorrida {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Corrida corrida = new Corrida(45, 5, 2.25, 0.50);

            System.out.print("Digite a distância percorrida (km): ");
            corrida.setDistancia(sc.nextDouble());

            System.out.print("Digite o tempo de espera (minutos): ");
            corrida.setTempoEspera(sc.nextInt());

            System.out.print("Digite a tarifa base (R$): ");
            corrida.setTarifaBase(sc.nextDouble());

            System.out.print("Digite o fator de demanda (1.0 = normal, 1.5 = pico): ");
            corrida.setFatorDemanda(sc.nextDouble());

            corrida.exibirDetalhesCorrida();

            sc.close();
        }
    }