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
public class Chamada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a1, a2;
        ListaAlunos la;
        
        a1 = new Aluno("Cidinei Jhonson", "0123456789");
        //a1.print();
        
        a2 = new Aluno("Agostinho Carrara", "9876543210");
        //a2.print();
        
        la = new ListaAlunos(2);
        la.add(a1);
        la.add(a2);
        la.registrarFalta(0);
        la.registrarFalta(1);
        la.printAlunos();
        la.registrarFalta(3);
        
    }
    
}
