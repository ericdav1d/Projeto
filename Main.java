
package TesteDoBanco;


import Contas.Banco;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Banco Bank = new Banco();
        Scanner teclado = new Scanner(System.in);
        
        int escolha = 0;
        
        do{
            System.out.println("\n(1) Cadastrar Conta Poupanca.");
            System.out.println("(2) Cadastrar Conta Corrente .");
            System.out.println("(3) Remover Conta.");
            System.out.println("(4) Buscar Conta.");
            System.out.println("(5) Imprimir Contas.");
            System.out.println("(0) Sair.\n"); 
           
            escolha = teclado.nextInt();
            
             if(escolha == 1){
                System.out.println("Nome do Titular:");
                String titular = teclado.next();
                
                System.out.println("Agencia:");
                int agencia = teclado.nextInt();
                
                System.out.println("Saldo:");
                double saldo = teclado.nextDouble();
                System.out.println("\n");
                
                ContaPoupanca cp = new ContaPoupanca(titular, agencia, saldo);   
                Bank.armazenar(cp);
             }
             else if(escolha == 2){
                System.out.println("Nome do Titular:");
                String titular = teclado.next();
                
                System.out.println("Agencia:");
                int agencia = teclado.nextInt();
                
                System.out.println("Saldo:");
                double saldo = teclado.nextDouble();
                System.out.println("\n");
                
                ContaCorrente cC = new ContaCorrente(titular, agencia, saldo);   
                Bank.armazenar(cC);
             }
             else if(escolha==3){
                 System.out.println("Qual conta voce deseja remover?");
                 Bank.remover(teclado.next());
             }
             else if(escolha == 4){
                 System.out.println("Qual conta voce deseja encontrar?");
                 Bank.buscar(teclado.next());
                 
             }
             else if (escolha == 5){
                 Bank.imprimir();
             }
            
             else{
                 System.out.println("***Voce saiu do programa***");
             }        
        }while(escolha != 0);
    }
        
}

    
            

    
                    
                    