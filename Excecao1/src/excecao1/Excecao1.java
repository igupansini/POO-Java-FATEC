/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excecao1;

/**
 *
 * @author 0040481811033
 */
public class Excecao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int list[] = new int[10];
        
        try{
            for(int i = 0; i < 12; i++){
            list[i] = i;
            }
        }
        
        catch(Exception exc){
            System.out.println(exc);
        }
        
        System.out.println("Final do programa! \n");
    }
    
}
