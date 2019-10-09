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
public class Proprio extends Carro{
    private double valorCompra;
    private String dataCompra;
    
    //Construtor
    public Proprio(String placa, String modelo, int ano, double valorCompra, String dataCompra){
        super(placa, modelo, ano);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }
    
    @Override
    public boolean oferta(double valor){
        return (valor >= valorCompra * 1.1);
    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Data de compra: " + dataCompra + "\n" +
                           "Valor de compra: " + valorCompra + "\n");
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    
}
