package controleestoque;

public class Produto {

    private int cod;
    private String descr;
    private int qtd;

    public Produto(int cod, String descr, int qtd) {
        this.cod = cod;
        this.descr = descr;
        this.qtd = qtd;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getCod() {
        return cod;
    }

    public String getDescr() {
        return descr;
    }

    public int getQtd() {
        return qtd;
    }

    @Override
    public String toString() {
        return cod + "\t" + qtd + "\t" + descr;
    }

    public void print() {
        System.out.println(toString());
    }
}
