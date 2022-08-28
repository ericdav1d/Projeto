
package Contas;

import java.io.PrintStream;


public abstract class Conta {
    private String titular;
    private String numero;
    private int agencia;
    private double saldo;

    public Conta(String titular, int agencia, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.saldo = saldo;
        
    }
    
    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void transferir(Conta contaDestino, double valor){
           this.saldo = this.saldo - valor;
    }
    
    
    public void exibirDados(){
       System.out.printf("********************\nTitular: %s \nagencia: %d\nsaldo: %.2f\n********************\n",this.getTitular(),this.getAgencia(),this.getSaldo());
        
    }
}
