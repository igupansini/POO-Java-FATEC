package controleestoque;

public class Estoque {

    private Produto list[];
    private int count;

    public Estoque(int capMax) {
        this.list = new Produto[capMax];
        this.count = 0;

    }

    public int buscarCodigo(int codigo) {
        int index = 0;
        for (Produto p : this.list) {
            if (p != null) {
                if (p.getCod() == codigo) {
                    return index;
                }
            }
            index++;
        }
        return -1;
    }

    public void add(Produto pd) {
        if (buscarCodigo(pd.getCod()) == -1) {
            if (this.count < this.list.length) {
                this.list[this.count] = pd;
                this.count++;
            }
        }
    }

    public void adicionarUnidades(int cod, int qtd) {
        for (Produto p : this.list) {
            if (p != null) {
                if (p.getCod() == cod) {
                    p.setQtd(p.getQtd() + qtd);
                }
            }
        }
    }

    public void retirarUnidades(int cod, int qtd) {
        for (Produto p : this.list) {
            if (p != null) {
                if (p.getCod() == cod && p.getQtd() > qtd) {
                    p.setQtd(p.getQtd() - qtd);
                }
            }
        }
    }

    public void reposicao(int qtdMin) {
        for (Produto p : this.list) {
            if (p != null) {
                if (p.getQtd() < qtdMin) {
                    p.print();
                }
            }
        }
    }
}
