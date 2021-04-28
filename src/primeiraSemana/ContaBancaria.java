package primeiraSemana;

import java.util.Scanner;

public class ContaBancaria {
    private String numero;
    private int agencia;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria(){
        this.saldo = 0;
    }

    public ContaBancaria(String numero, int agencia, String nomeTitular, double saldo){
        this.numero = numero;
        this.agencia = agencia;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(Double valor) throws Exception{
        if(valor <= 0){
            throw new Exception("Valor inválido");
        }
        this.saldo += valor;
        imprimirSaldo();
    }
    public void sacar(Double valor) throws Exception{
        if(valor <= 0 || valor > getSaldo()){
            throw new Exception("Valor inválido");
        }
        this.saldo -= valor;
        imprimirSaldo();
    }

    public void imprimirSaldo(){
        System.out.println("Seu saldo é: "+getSaldo());
    }

    public static void main(String[] args){
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
