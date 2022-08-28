
package Contas;

import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta{
    
    private final double limAccount = -50;

    public ContaPoupanca(String titular, int agencia, double saldo) {
        super(titular, agencia, saldo);
    }


    @Override
    public void sacar(double valor){
        if( (super.getSaldo() - valor) >= limAccount){
            // super.setSaldo((super.getSaldo() - valor));
            JOptionPane.showMessageDialog(null,"*** Saque realizado com sucesso! ***");
        }
        else{
            JOptionPane.showMessageDialog(null,"*** Saque não pode ser realizado! ***");
        }       
    }
    
    @Override
    public void depositar(double valor){
        // super.setSaldo((super.getSaldo() + valor));    
        JOptionPane.showMessageDialog(null,"*** Deposito realizado! ***");
    }
    
    
    @Override
    public void exibirDados(){
        System.out.printf("********************\nTitular: %s \nagencia: %d\nsaldo: %.2f\n********************\n",this.getTitular(),this.getAgencia(),this.getSaldo());
    }
    
    public double getLimite() {
        return limAccount;
    }
    
}
