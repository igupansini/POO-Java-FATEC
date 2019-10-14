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
public class Filmes extends Discos {
    protected String nomeDiretor;
    protected int anoProducao;

    public Filmes(String nomeDiretor, int anoProducao, int copiasTot, String titulo) {
        super(copiasTot, titulo);
        this.nomeDiretor = nomeDiretor;
        this.anoProducao = anoProducao;
    }
    
    @Override
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Nome do Diretor: " + nomeDiretor + "\n" +
                           "Ano de Producao: " + anoProducao + "\n" +
                           "Disco de Filme!" + "\n");
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public void setNomeDiretor(String nomeDiretor) {
        this.nomeDiretor = nomeDiretor;
    }

    public int getAnoProducao() {
        return anoProducao;
    }

    public void setAnoProducao(int anoProducao) {
        this.anoProducao = anoProducao;
    }
    
    
    
}
