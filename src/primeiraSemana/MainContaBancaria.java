package primeiraSemana;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria("12345-6",23, "Ana", 2000);
        int opcao = -1;
        double valor = 0;
        do{
            System.out.println("\n0. Sair");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            opcao = entrada.nextInt();
            if(opcao == 0){
                break;
            }else if(opcao == 1){
                conta1.imprimirSaldo();
            }else if(opcao == 2){
                System.out.print("Quanto deseja depositar?");
                valor = entrada.nextDouble();
                try{
                    conta1.depositar(valor);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else if(opcao == 3){
                System.out.print("Quanto deseja sacar?");
                valor = entrada.nextDouble();
                try{
                    conta1.sacar(valor);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }while(opcao != 0);

        entrada.close();
    }
}
