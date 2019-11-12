/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0040481811033;

/**
 *
 * @author 0040481811033 Igor Martins Pansini
 * 
 * Nota 10.0
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Professor p1;
        p1 = new Professor("POO", 25,"Perrotti", "123456789", 4);
        p1.registrarAulas(60);
        p1.hollerith();
        p1.zerarMes();
        p1.hollerith();
        
        Funcionario f1;
        f1 = new Funcionario("Financeiro", 1000, "Afonso", "9874654321", 5);
        f1.hollerith();
        f1.registrarFalta();
        f1.hollerith();
    }
    
}
