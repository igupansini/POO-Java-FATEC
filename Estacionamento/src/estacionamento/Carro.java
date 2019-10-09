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
public abstract class Carro {
    private String placa, modelo, vendedor;
    private int ano;
    private boolean disp;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    //Construtor
    public Carro(String placa, String modelo, int ano){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        disp = true;
        vendedor = "";
    }
    
    //Método disponivel
    public boolean disponivel(){
        return disp;
    }
    
    //Assinatura do método oferta abstrato 
    public abstract boolean oferta(double valor);
    
    //Método venderCarro
    public boolean venderCarro(String vendedor, double valor){
        if(!disp){
            return false;
        }
        
        if(!oferta(valor)){
            return false;
        }
        
        this.vendedor = vendedor;
        disp = false;
        return true;
    }
    
    //Método para imprimir os dados
    public void imprimeDados(){
        System.out.println("Placa: " + placa + "\n" + 
                "Modelo: " + modelo + "\n" +
                "Ano: " + ano + "\n" +
                "Disponivel: " + (disp? "Sim":"Nao") + "\n" + 
                "Vendedor: " + vendedor);
    }
    
}

