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
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c1, c2;
        c1 = new Cliente("Josney LTDA", "Zé da Esquina", "3478-3478");
        c2 = new Cliente("Albuquerque S/A", "Fulano Beltrano", "8978-5529");
        
        Amigo a1;
        a1 = new Amigo("01/01", "Ferdinando Albuquerque", "4002-8922");
        
        ListaContato lc;
        lc = new ListaContato(3);
        lc.add(c1);
        lc.add(a1);
        lc.add(c2);
        lc.listarAmigos();
        lc.listarClientes();
    }
    
}
