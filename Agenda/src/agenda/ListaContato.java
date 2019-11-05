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
public class ListaContato {
    protected Contato lista[];
    protected int contador;

    public ListaContato(int capMax) {
        lista = new Contato[capMax];
        contador = 0;
    }
    
    public boolean add(Contato ct){
        if(contador >= lista.length){
            return false;
        }
        else{
            lista[contador] = ct;
            contador++;
            return true;
        }
    }
    
     public void listarAmigos(){
        for(int i = 0; i < contador; i++){
                if(lista[i] instanceof Amigo){
                    lista[i].print();
            }
        }    
        }
     
     public void listarClientes(){
         for(int i = 0; i < contador; i++){
             if(lista[i] instanceof Cliente){
                 lista[i].print();
             }
         }
     }
    }
    
    



