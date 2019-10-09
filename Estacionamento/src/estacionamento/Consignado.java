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
public class Consignado extends Carro{
    private double valorProp;
    private String nomeProp;  
    
    //Construtor
    public Consignado(String placa, String modelo, int ano, double valorProp, String nomeProp){
        super(placa, modelo, ano);
        this.valorProp = valorProp;
        this.nomeProp = nomeProp;
    }
    
    @Override
    public boolean oferta(double valor){
        return (valor >= valorProp * 1.05);
    }

    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Valor do proprietario: " + valorProp + "\n" +
                           "Nome do proprietario: " + nomeProp);
    }

    public double getValorProp() {
        return valorProp;
    }

    public void setValorProp(double valorProp) {
        this.valorProp = valorProp;
    }

    public String getNomeProp() {
        return nomeProp;
    }

    public void setNomeProp(String nomeProp) {
        this.nomeProp = nomeProp;
    }
    
    
}
