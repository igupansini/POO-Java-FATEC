/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chamada;

/**
 *
 * @author 0040481811033
 */
public class Aluno {
    protected String nome, ra;
    protected int faltas;

    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
        faltas = 0;
    }
    
    public void print(){
        System.out.println("Nome: " + nome + "\n" +
                           "RA: " + ra + "\n" +
                           "Faltas: " + faltas + "\n");
    }
    
    public void registrarFalta(int index){
         faltas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
     
}
