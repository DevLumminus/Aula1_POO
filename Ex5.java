package Aula1_POO;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner Salario_Novo = new Scanner(System.in); // Cria um objeto Scanner Salario
        String resposta;
        do {
            System.out.println("Digite o seu salario (1000,50): "); //Mensagem para receber o salario
            float Salario = Salario_Novo.nextFloat(); // Lê os dados digitado

            System.out.println("Digite o aumento que desejas (25 = 25%): "); //Mensagem para receber o salario
            double Aumento = Salario_Novo.nextFloat(); // Acrescenta 25% no salario

            double PorcentagemDeci = (Aumento/100) + 1;

            System.out.printf("O seu salario %.2f, com uma aumento de %.2f%%, ficou %.2f.\n", Salario, Aumento, Salario*PorcentagemDeci); //Mensagem para receber o salario
            // Consumir a quebra de linha pendente
            Salario_Novo.nextLine();

            System.out.print("Deseja converter outro salário? (sim/não): ");
            resposta = Salario_Novo.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Programa Encerrado");
        Salario_Novo.close();
    }
}
