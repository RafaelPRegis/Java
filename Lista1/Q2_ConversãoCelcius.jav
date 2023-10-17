"""
Programa Com intuito de converter Fahrenheit ou kelvin para Celcius

"""

import java.util.Scanner;


public class Q2_ConversãoCelsius {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Temperatura
        System.out.println("Dejesa converte Fahrenheit ou Kelvin? [F/K]");
        String Tipo = sc.next().toUpperCase();

        System.out.println("Informe a temperatura a ser convertida: ");
        double Temp = sc.nextDouble();


        //Conversão
        if (Tipo == "F") {
            double Cs = (5 * (Temp - 32) % 9);
        }
        if (Tipo == "K") {
            double Cs = (Temp - 273.15);
        }
        else {
            System.out.println("Temperatura não identificada, tente novamente");
        }


        //Print
        System.out.println("Ao converter %d, temos o valor: $d", Temp, Cs);

        sc.close();
    }
}