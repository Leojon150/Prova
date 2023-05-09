import java.util.Scanner;

public class Prova {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.print("Digite a placa do veículo: ");
        String placa = sc.nextLine();

        System.out.print("Digite o valor do litro de combustível: ");
        double valorLitro = sc.nextDouble();

      
        System.out.print("Digite a quantidade de quilômetros rodados a 60 km/h: ");
        double km60 = sc.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 80 km/h: ");
        double km80 = sc.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 100 km/h: ");
        double km100 = sc.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 120 km/h: ");
        double km120 = sc.nextDouble();

        System.out.print("Digite a quantidade de quilômetros rodados a 140 km/h: ");
        double km140 = sc.nextDouble();


        double comb60 = km60 / 12.0;
        double comb80 = km80 / 10.0;
        double comb100 = km100 / 8.0;
        double comb120 = km120 / 6.666;
        double comb140 = km140 / 5.714;

       
        double totalCombustivel = comb60 + comb80 + comb100 + comb120 + comb140;
        double custoTotal = totalCombustivel * valorLitro;

        
        double distanciaTotal = km60 + km80 + km100 + km120 + km140;
        double tempoTotal = km60 / 60.0 + km80 / 80.0 + km100 / 100.0 + km120 / 120.0 + km140 / 140.0;
        double velocidadeMedia = distanciaTotal / tempoTotal;

      
        System.out.println("Placa do veículo: " + placa);
        System.out.println("Custo total da viagem: R$ " + String.format("%.2f", custoTotal));
        System.out.println("Velocidade média ponderada da viagem: " + String.format("%.2f", velocidadeMedia) + " km/h");
        System.out.println("Quantidade total de combustível: " + String.format("%.2f", totalCombustivel) + " litros");

        sc.close();
    }
}
