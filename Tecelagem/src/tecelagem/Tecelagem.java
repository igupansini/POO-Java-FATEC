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
public class Tecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Administracao a1;
        a1 = new Administracao("Jacquin", "6698956242", 5000);
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        a1.novoMes();
        a1.hollerith();
        
        Producao p1;
        p1 = new Producao("Ernesto", "5612356972", 15);
        p1.registrarHorasDiurnas(120);
        p1.registrarHorasNoturnas(35);
        p1.hollerith();
        p1.novoMes();
        p1.hollerith();
    }
    
}
