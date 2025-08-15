import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in); // Cria um objeto Scanner
        int y = 3;
        float soma = 0;
        for (int x = 0; x < y; x++) {
            System.out.printf("Digite a  %dº nota (ex: 3,8):", x + 1);
            soma += Leitura.nextFloat(); // Lê os dados digitados
        }
        float media = soma/3;
        System.out.println("As media das notas é:" + media);
    }
}
