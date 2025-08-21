package Aula1_POO;

import java.util.Scanner;

public class Exercicio_Aula_01 {
    public static void main(String[] args) {

        //Ex1

        System.out.println("Ex1");
        Scanner Leitura = new Scanner(System.in); // Cria um objeto Scanner
        int y=4;
        int soma = 0;
        for (int x=0; x<y; x++){
            System.out.printf("Dê %dº numero:", x+1);
            soma += Leitura.nextInt(); // Lê os dados digitados
        }
        System.out.println("As soma dos numeros dá:" + soma);

        //Ex2

        System.out.println("Ex2");
        int z = 3;
        float soma2 = 0;
        for (int x = 0; x < z; x++) {
            System.out.printf("Digite a  %dº nota (ex: 3,8):", x + 1);
            soma2 += Leitura.nextFloat(); // Lê os dados digitados
        }
        float media = soma2/3;
        System.out.println("As media das notas é:" + media);

        //Ex3

        System.out.println("Ex3");
        int a = 3; //Variavel do loop
        float soma_nota = 0; //Inicialização da variavel soma_nota
        int soma_peso = 0; //Inicialização da variavel soma_peso

        // loop do somatorio
        for (int x = 0; x < a; x++) {
            System.out.printf("Digite a  %dº nota (ex: 3,8):", x + 1); //Mensagem de exibição
            float nota = Leitura.nextFloat();
            if(nota>10){
                System.out.println("Nota não aceita (somente de 0 a 10)");
                System.exit(0);
            }
            System.out.printf("Digite o peso da %dº nota (ex: 9):", x + 1); //Mensagem de exibição
            int peso = Leitura.nextInt();
            soma_peso += peso; // Recebe o valor dos pesos e as somas

            soma_nota += nota * peso;
        }
        float media_com_pesos = soma_nota / soma_peso; //Faz a media
        System.out.println("As media das notas é:" + media_com_pesos); //Mostra o resultado

        //Ex4

        System.out.println("Ex4");
        System.out.println("Digite o seu salario (1000,50): "); //Mensagem para receber o salario
        float Sal = Leitura.nextFloat(); // Lê os dados digitado
        double NovoSal = (Sal*125)/100; // Acrescenta 25% no salario
        System.out.printf("O seu novo salario será %.2f (almento de 25%%)", NovoSal);

        //Ex5

        System.out.println("Ex5");
        String resposta;
        do {
            System.out.println("Digite o seu salario (1000,50): "); //Mensagem para receber o salario
            float Salario = Leitura.nextFloat(); // Lê os dados digitado

            System.out.println("Digite o aumento que desejas (25 = 25%): "); //Mensagem para receber o salario
            double Aumento = Leitura.nextFloat(); // Acrescenta 25% no salario

            double PorcentagemDeci = (Aumento/100) + 1;

            System.out.printf("O seu salario %.2f, com uma aumento de %.2f%%, ficou %.2f.\n", Salario, Aumento, Salario*PorcentagemDeci); //Mensagem para receber o salario
            // Consumir a quebra de linha pendente
            Leitura.nextLine();

            System.out.print("Deseja converter outro salário? (sim/não): ");
            resposta = Leitura.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Programa Encerrado");

        //Ex6

        System.out.println("Ex6");
        do {
            System.out.println("Digite o seu salario (1000,50): "); //Mensagem para receber o salario
            float Salario = Leitura.nextFloat(); // Lê os dados digitado

            double NovoSalario = Salario*1.05;
            double ImpostoSalario = NovoSalario*0.07;

            System.out.printf("O seu salario R$%.2f. \nCom a gratificação de 5%% é R$%.2f, porem R$%.2f é imposto.\n", Salario, NovoSalario, ImpostoSalario); //Mensagem para receber o salario
            // Consumir a quebra de linha pendente
            Leitura.nextLine();

            System.out.print("Deseja converter outro salário? (sim/não): ");
            resposta = Leitura.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Programa Encerrado");
        Leitura.close();
    }
}
