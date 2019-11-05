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
public class ListaAlunos{
    protected Aluno lista[];
    protected int contador;

    public ListaAlunos(int capacidadeMax) {
        lista = new Aluno[capacidadeMax];
        contador = 0;
    }
    
    public boolean add(Aluno a){
        if(contador >= lista.length){
            return false;
        }
        else{
            lista[contador] = a;
            contador++;
            return true;
        }
    }
    
    public void registrarFalta(int index){
        if(index >= contador || index < 0){
            System.out.println("Erro: Posicao nao encontrada! \n");
        }
        else{
            lista[index].registrarFalta(index);
        }
    }
    
    public void printAlunos(){
        for(int i = 0; i < contador; i++){
            lista[i].print();
        }
    }
}
