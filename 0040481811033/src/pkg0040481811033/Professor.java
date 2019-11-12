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
public class Professor extends Pessoa {
    protected String curso;
    protected int horaAula;
    protected int aulas;

    public Professor(String curso, int horaAula, String nome, String rg, int filhos) {
        super(nome, rg, filhos);
        this.curso = curso;
        this.horaAula = horaAula;
        aulas = 0;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(int horaAula) {
        this.horaAula = horaAula;
    }
    
    public void registrarAulas(int Qtd){
        this.aulas = Qtd;
    }

    @Override
    public double calcularSalario() {
        return (aulas * horaAula) + (auxProcriacao * filhos);
    }

    @Override
    public void zerarMes() {
        horaAula = 0;
        aulas = 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Curso: " + curso + "\n" +
                           "Hora aula: " + horaAula + "\n" +
                           "Aulas: " + aulas + "\n" +       
                           "Salario: " + calcularSalario() + "\n");       
    }
}
