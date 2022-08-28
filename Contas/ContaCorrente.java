
package Contas;

import javax.swing.JOptionPane;


public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(String titular, int agencia, double saldo) {
        super(titular, agencia, saldo);
    }

    @Override
    public double getImposto() {
        return super.getSaldo()* 0.01;
    }

    @Override
    public void sacar(double valor) {
       if( super.getSaldo() >= (valor + getImposto())){
            // super.setSaldo((super.getSaldo()- valor - getImposto()));
            JOptionPane.showMessageDialog(null,"*** Saque realizado com sucesso! ***");
        }
       else{
            JOptionPane.showMessageDialog(null,"*** Saque não pode ser realizado! ***");
        }
    }
    
    @Override
    public void depositar(double valor){
        if((super.getSaldo() - getImposto() + valor)<0){
            JOptionPane.showMessageDialog(null,"*** Deposito não pode ser realizado! ***");
        }
        else{
            // super.setSaldo((super.getSaldo() + valor - getImposto()));
            JOptionPane.showMessageDialog(null,"*** Deposito realizado! ***");
        }
    }
    
    @Override
    public void exibirDados(){
        System.out.printf("********************\nTitular: %s \nagencia: %d\nsaldo: %.2f\n********************\n",this.getTitular(),this.getAgencia(),this.getSaldo());
    }
    
}
