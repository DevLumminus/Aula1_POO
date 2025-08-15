/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre.marcos
 */
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner Leitura = new Scanner(System.in); // Cria um objeto Scanner
        int y=4;
        int soma = 0;
        for (int x=0; x<y; x++){
            System.out.printf("Dê %dº numero:", x+1);
            soma += Leitura.nextInt(); // Lê os dados digitados
        }
        System.out.println("As soma dos numeros dá:" + soma);
        
    }
}
