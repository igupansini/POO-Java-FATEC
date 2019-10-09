/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author 0040481811033
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Proprio p1;
        Consignado c1;
        
        p1 = new Proprio("ABC-0123", "Audi A4", 2015, 71500, "09/12/2019");
        p1.imprimeDados();
        p1.oferta(83500);
        p1.venderCarro("Beltrano", 83500);
        p1.imprimeDados();
        
        c1 = new Consignado("XYZ-9876", "BMW X1", 2017, 68500, "Fulano");
        c1.imprimeDados();
        c1.oferta(79500);
        c1.venderCarro("Ciclano", 79500);
        c1.imprimeDados();
    }
    
}
