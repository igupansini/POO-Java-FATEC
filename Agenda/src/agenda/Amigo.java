/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author 0040481811033
 */
public class Amigo extends Contato {
    protected String dataAniversario;

    public Amigo(String dataAniversario, String nome, String fone) {
        super(nome, fone);
        this.dataAniversario = dataAniversario;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Data de Aniversario: " + dataAniversario + "\n");
    }
}
