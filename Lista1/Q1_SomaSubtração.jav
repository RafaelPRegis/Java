"""
O Programa Calcula a soma, subtração, multiplicação e divisão do numero fornecido

"""

import java.util.Scanner;


public class Q1_SomaSubtração {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Valor1
        System.out.println("Digite o primeiro valor");
        int Valor1 = sc.nextInt();

        //Valor2
        System.out.println("Digite o segundo valor");
        int Valor2 = sc.nextInt();

        //Contas
        int Soma = Valor1 + Valor2;
        int Subtração = Valor1 - Valor2;
        int Multiplicação = Valor1 * Valor2;
        int Divisão = Valor1 % Valor2;

        //Print - Saida
        System.out.println("Soma entre os valore é " + Soma);
        System.out.println("Subtração entre os valore é " + Subtração);
        System.out.println("Multiplicação entre os valore é " + Multiplicação);
        System.out.println("Divisão entre os valore é " + Divisão);

        sc.close();
    }
}
