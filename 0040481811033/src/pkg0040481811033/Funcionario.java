/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg0040481811033;

/**
 *
 * @author 0040481811033 Igor Martins Pansini
 */
public class Funcionario extends Pessoa {
    protected String departamento;
    protected double salarioFixo;
    protected int faltas;
    protected int valeCoxinha;

    public Funcionario(String departamento, double salarioFixo, String nome, String rg, int filhos) {
        super(nome, rg, filhos);
        this.departamento = departamento;
        this.salarioFixo = salarioFixo;
        faltas = 0;
        valeCoxinha = 42;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    
    public void registrarFalta(){
        faltas++;
    }

    @Override
    public double calcularSalario() {
        return salarioFixo + (auxProcriacao * filhos) + valeCoxinha - (salarioFixo/20 * faltas);
    }

    @Override
    public void zerarMes() {
       faltas = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Departamento: " + departamento + "\n" +
                           "Salario Fixo: " + salarioFixo + "\n" +
                           "Faltas: " + faltas + "\n" +
                           "Vale Coxinha: " + valeCoxinha + "\n" + 
                           "Salario: " + calcularSalario() + "\n");       
    }
    
    
}
