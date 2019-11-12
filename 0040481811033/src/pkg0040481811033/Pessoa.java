/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0040481811033;

/**
 *
 * @author 0040481811033 Igor Martins Pansini
 */
public abstract class Pessoa {
    protected String nome, rg;
    protected int filhos;
    protected double auxProcriacao;

    public Pessoa(String nome, String rg, int filhos) {
        this.nome = nome;
        this.rg = rg;
        this.filhos = filhos;
        auxProcriacao = 100.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getFilhos() {
        return filhos;
    }

    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }
    
    public abstract double calcularSalario();
    
    public void hollerith(){
      System.out.println("Nome: " + nome + "\n" +
                         "RG: " + rg + "\n" +
                         "Filhos: " + filhos);  
    }
    
    public abstract void zerarMes();
}
