/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecelagem;

/**
 *
 * @author 0040481811033
 */
public abstract class Funcionario {
    protected String nome, rg;

    //Construtor
    public Funcionario(String nome, String rg) {
        this.nome = nome;
        this.rg = rg;
    }
    
    //Métodos abstratos
    public abstract double salarioLiquido();
    
    public abstract void novoMes();
    
    //Método para imprimir o hollerith
    public void hollerith(){
        System.out.println("Nome: " + nome + "\n" +
                           "RG: " + rg + "\n" +
                           "Salario Liquido: " + salarioLiquido());
    }
    
}
