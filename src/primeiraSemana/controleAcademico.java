package primeiraSemana;

import java.util.Scanner;

public class controleAcademico {
    public static int TOTAL_AULAS = 68;
    public static int PERCENTUAL_LIMITE_FALTAS = 25;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] notas = new float[3];
        float media = 0;

        for(int i=0; i< notas.length;i++) {
            notas[i] = entrada.nextFloat();
            media += notas[i];
        }
        int totalFaltas = entrada.nextInt();
        media /= 3;

        if(media >= 7){
            System.out.println("Aprovado "+media);
        }else if(media < 7){
            System.out.println("Reprovado por nota "+media);
        }else{
            System.out.println("Reprovado por falta");
        }
        entrada.close();
    }
}
