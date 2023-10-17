"""
O Programa calcula como fiacaria um valor de uma compra ao ser dividido em X vezes

"""

import java.util.Scanner;


public class Q4_Prestações {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Preço e Prestação
        System.out.println("Informe o valor da compra: ");
        int reço = sc.nextInt();

        System.out.println("Em quantas vezes planeja dividir o valor? ");
        int prestacao = sc.nextInt();


        //Calculo
        int prestacaoT = Preço % pretacao;

        //Saida
        System.out.println("A prestação em cinco vezes ficará por " + prestacao);

        sc.close();
    }
}
