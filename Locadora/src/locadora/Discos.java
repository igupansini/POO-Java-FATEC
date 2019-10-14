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
public abstract class Discos {
    protected int copiasTot, copiasDisp;
    protected String titulo;
    protected boolean disp;

    public Discos(int copiasTot, String titulo) {
        this.copiasTot = copiasTot;
        this.titulo = titulo;
        copiasDisp = copiasTot;
        disp = true;
    }
    
    public boolean disponivel(){
        if(copiasDisp > 0){
            return disp = true;
        }
        else{
            return disp = false;
        }
    }
    
    public void imprimeDados(){
        System.out.println("Copias Totais: " + copiasTot + "\n" +
                           "Copias Disponiveis: " + copiasDisp + "\n" +
                           "Titulo: " + titulo + "\n" + 
                           "Disponivel: " + disponivel());
    }
    
    public boolean locar(){
        if(copiasDisp != 0){
            copiasDisp--;
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public boolean devolver(){
        if(copiasDisp < copiasTot){
            copiasDisp++;
            return true;
        }
        else{
            return false;
        }
    }

    public int getCopiasTot() {
        return copiasTot;
    }

    public void setCopiasTot(int copiasTot) {
        this.copiasTot = copiasTot;
    }

    public int getCopiasDisp() {
        return copiasDisp;
    }

    public void setCopiasDisp(int copiasDisp) {
        this.copiasDisp = copiasDisp;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
