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
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testando as classes
        Filmes f1;
        f1 = new Filmes("Cuca Belludo", 2008, 3, "As Tranças do Rei Careca");
        f1.imprimeDados();
        f1.locar();
        f1.imprimeDados();
        f1.locar();
        f1.imprimeDados();
        f1.locar();
        f1.imprimeDados();
        f1.devolver();
        f1.imprimeDados();
        
        Games g1;
        g1 = new Games("EA Sports", "Xbox One", 2, "UFC 2019");
        g1.imprimeDados();
        g1.locar();
        g1.imprimeDados();
        g1.locar();
        g1.imprimeDados();
        g1.devolver();
        g1.imprimeDados();
    }
    
}
