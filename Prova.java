import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Digite a placa do veículo: ");
        String placa = scanner.nextLine();

        System.out.print("Digite o valor do litro de combustível: ");
        double valorLitro = scanner.nextDouble();

      
        System.out.print("Digite a quantidade de quilômetros rodados a 60 km/h: ");
        double km60 = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 80 km/h: ");
        double km80 = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 100 km/h: ");
        double km100 = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 120 km/h: ");
        double km120 = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 140 km/h: ");
        double km140 = scanner.nextDouble();


        double combustivel60 = km60 / 12.0;
        double combustivel80 = km80 / 10.0;
        double combustivel100 = km100 / 8.0;
        double combustivel120 = km120 / 6.666;
        double combustivel140 = km140 / 5.714;

       
        double totalCombustivel = combustivel60 + combustivel80 + combustivel100 + combustivel120 + combustivel140;
        double custoTotal = totalCombustivel * valorLitro;

        
        double distanciaTotal = km60 + km80 + km100 + km120 + km140;
        double tempoTotal = km60 / 60.0 + km80 / 80.0 + km100 / 100.0 + km120 / 120.0 + km140 / 140.0;
        double velocidadeMedia = distanciaTotal / tempoTotal;

      
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Custo total da viagem: R$ " + String.format("%.2f", custoTotal));
        System.out.println("Velocidade média ponderada da viagem: " + String.format("%.2f", velocidadeMedia) + " km/h");
        System.out.println("Quantidade total de combustível: " + String.format("%.2f", totalCombustivel) + " litros");

        scanner.close();
    }
}
