/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author Pansini
 */
public class Games extends Discos {
    protected String fabricante, console;

    public Games(String fabricante, String console, int copiasTot, String titulo) {
        super(copiasTot, titulo);
        this.fabricante = fabricante;
        this.console = console;
    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Fabricante: " + fabricante + "\n" +
                           "Console: " + console + "\n" +
                           "Disco de Console!" + "\n");
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }
    
    
    
}
