"""
Programa com intuito de converter Kelvin ou Celcius pra qualquer uma das outras

"""

import java.util.Scanner;


public class Q3_ConversãoDeTemp {
    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Temperatura
        System.out.println("Dejesa converte Celcius ou Kelvin? [C/K]");
        String Tipo = sc.next().toUpperCase();

        System.out.println("Informe a temperatura a ser convertida:");
        double Temp = sc.nextDouble();

        //Conversão
        if (Tipo == "C") {
            double Fh = (Temp * 1.8) + 32;
        }
        if (Tipo == "K") {
            double Fh = (Temp - 273.15) * 1.8 + 32;
        }
        

        System.out.println(Cs + "C° equivale a " + Fh + "Fh°");

        sc.close();

    }
}