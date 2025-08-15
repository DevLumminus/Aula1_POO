import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner Nota = new Scanner(System.in); // Cria o objeto Scanner para nota
        Scanner Peso = new Scanner(System.in); // Cria um objeto Scanner para peso
        int z = 3; //Variavel do loop
        float soma_nota = 0; //Inicialização da variavel soma_nota
        int soma_peso = 0; //Inicialização da variavel soma_peso

        // loop do somatorio
        for (int x = 0; x < z; x++) {
            System.out.printf("Digite a  %dº nota (ex: 3,8):", x + 1); //Mensagem de exibição
            float nota = Nota.nextFloat();
            if(nota>10){
                System.out.println("Nota não aceita (somente de 0 a 10)");
                System.exit(0);
            }
            System.out.printf("Digite o peso da %dº nota (ex: 9):", x + 1); //Mensagem de exibição
            int peso = Peso.nextInt();
            soma_peso += peso; // Recebe o valor dos pesos e as somas

            soma_nota += nota * peso;
        }
        float media_com_pesos = soma_nota / soma_peso; //Faz a media
        System.out.println("As media das notas é:" + media_com_pesos); //Mostra o resultado
    }
}
