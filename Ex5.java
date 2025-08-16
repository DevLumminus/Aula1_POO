package Aula1_POO;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner Salario = new Scanner(System.in); // Cria um objeto Scanner Salario
        Scanner Aumento = new Scanner(System.in); // Cria um objeto Scanner Salario
        Scanner Resposta = new Scanner(System.in); // Cria um objeto Scanner Salario
        StringBuffer resposta;
        do {
            System.out.println("Digite o seu salario (1000,50): "); //Mensagem para receber o salario
            float Sal = Salario.nextFloat(); // Lê os dados digitado
            double NovoSal = (Sal * 125) / 100; // Acrescenta 25% no salario
            System.out.printf("O seu novo salario será %.2f (almento de 25%%)", NovoSal);

            System.out.println("Deseja converter outro salario?");
            resposta = Resposta.nextLine();

            if (resposta.equalsIgnoreCase("sim")){
                continue;
            } else{
                System.out.println("Programa Encerrado");
                break;
            }
        }
        while (resposta.equalsIgnoreCase("sim"));{
            System.out.println("Digite o seu salario (1000,50): "); //Mensagem para receber o salario
            float Sal = Salario.nextFloat(); // Lê os dados digitado
            double NovoSal = (Sal * 125) / 100; // Acrescenta 25% no salario
            System.out.printf("O seu novo salario será %.2f (almento de 25%%)", NovoSal);

            System.out.println("Deseja converter outro salario? (sim ou não)");
            resposta = Resposta.nextLine();
        }
    }
}
