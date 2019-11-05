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
public class Cliente extends Contato{
    protected String empresa;

    public Cliente(String empresa, String nome, String fone) {
        super(nome, fone);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    @Override
    public void print(){
        super.print();
        System.out.println("Empresa: " + empresa + "\n");
    }
}
