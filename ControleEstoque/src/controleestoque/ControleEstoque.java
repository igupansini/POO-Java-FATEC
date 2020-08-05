package controleestoque;

public class ControleEstoque {
    public static void main(String[] args) {
        Estoque estoque = new Estoque(2);
        
        Produto p1 = new Produto(1, "Chocolate", 20);
        Produto p2 = new Produto(2, "Bala", 15);
        
        estoque.add(p1);
        estoque.add(p2);
        
        estoque.adicionarUnidades(2, 5);
        estoque.reposicao(21);
        
        estoque.retirarUnidades(1, 3);
        estoque.reposicao(21);
        System.out.println(estoque.buscarCodigo(2));
    }
}
