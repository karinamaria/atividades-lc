package primeiraSemana;

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
}
