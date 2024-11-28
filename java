import java.util.Scanner;

public class ConsumoAutomovel {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double distancia = 0;
        double combustivel = 0;
        double consumoMedio;

        try {
            System.out.println("Digite a distância percorrida (em km): ");
            distancia = ler.nextDouble();
            if (distancia <= 0) {
                System.out.println("A distância deve ser um número positivo.");
                return;
            }

            System.out.println("Digite o valor do combustível consumido (em litros): ");
            combustivel = ler.nextDouble();
            if (combustivel <= 0) {
                System.out.println("O valor do combustível deve ser um número positivo.");
                return;
            }

            consumoMedio = distancia / combustivel;
            System.out.printf("Consumo médio do automóvel: %.2f km/l%n", consumoMedio);
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida. Certifique-se de digitar números válidos.");
        } finally {
            ler.close();
        }
    }
}
