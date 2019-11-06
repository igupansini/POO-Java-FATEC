/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author 0040481811033
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int lista[];
        lista = new int [3];
        
        lista[0] = 1;
        lista[1] = 3;
        lista[2] = 5;
        
        //Exibir todos os valores do vetor
        for(int i = 0; i < 3; i++){
           System.out.println(lista[i]); 
        }
        
        //Ler novos valores para o vetor
        for(int i = 0; i < 3; i++){
           lista[i] = sc.nextInt();
        }
        
        //Exibir todos os novos valores do vetor
        for(int i = 0; i < 3; i++){
           System.out.println(lista[i]); 
        }
        
        sc.close();
    }
    
}
