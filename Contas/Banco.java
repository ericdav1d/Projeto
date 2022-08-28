
package Contas;

import Contas.Conta;
import java.util.ArrayList;
import java.util.List;


public class Banco {
    
        List<Conta> ContasBanco = new ArrayList<>();
    
    
    public void armazenar(Conta inicio){
        this.ContasBanco.add(inicio);
    }
    
    public void remover(String nome){
        for (int i = 0; i < this.ContasBanco.size(); i++) {
            if(this.ContasBanco.get(i).getTitular().equals(nome)){
                this.ContasBanco.remove(i);
            }
        }
    }
   
    
    public int buscar(String nome){
        int posicao;
        posicao = 0;
        for (int i = 0; i < this.ContasBanco.size(); i++) {
            if(this.ContasBanco.get(i).getTitular().equals(nome)){
                posicao = i;
                this.ContasBanco.get(i).exibirDados();
              
            }
        }
        return posicao;
    }
    
    public void imprimir(){
        for (int i = 0; i < this.ContasBanco.size(); i++) {
            this.ContasBanco.get(i).exibirDados();
        }
    }
    
    }
    

