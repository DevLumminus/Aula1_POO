package Aula1_POO;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner Salario_Novo = new Scanner(System.in); // Cria um objeto Scanner Salario
        String resposta;
        do {
            System.out.println("Digite o seu salario (1000,50): "); //Mensagem para receber o salario
            float Salario = Salario_Novo.nextFloat(); // Lê os dados digitado

            double NovoSalario = Salario*1.05;
            double ImpostoSalario = NovoSalario*0.07;

            System.out.printf("O seu salario R$%.2f. \nCom a gratificação de 5%% é R$%.2f, porem R$%.2f é imposto.\n", Salario, NovoSalario, ImpostoSalario); //Mensagem para receber o salario
            // Consumir a quebra de linha pendente
            Salario_Novo.nextLine();

            System.out.print("Deseja converter outro salário? (sim/não): ");
            resposta = Salario_Novo.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Programa Encerrado");
        Salario_Novo.close();
    }
}
