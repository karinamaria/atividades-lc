package primeiraSemana;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] numeros = new float[2];

        System.out.println("#### CALCULADORA ####");
        for(int i=0; i<numeros.length; i++){
            System.out.print((i+1)+"º número:");
            numeros[i] = entrada.nextFloat();
        }

        System.out.println("A soma é: "+(numeros[0]+numeros[1]));
        System.out.println("A subtração é: "+(numeros[0]-numeros[1]));
        System.out.println("A multiplicação é: "+(numeros[0]*numeros[1]));
        System.out.println("A divisão é: "+(numeros[0]/numeros[1]));
        System.out.println("O resto da divisão é: "+(numeros[0]%numeros[1]));

        entrada.close();
    }
}
