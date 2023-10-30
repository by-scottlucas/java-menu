package Menu;

public class XTudo extends Sanduiche {

    // Atributos

    public XTudo(String n, String t, double p) {
        super(n, t, p);
    }

    @Override
    public void descricao() {
        System.out.println(" | Ingredientes: Pão, Hambúrguer, Queijo, Presunto, Milho, Ervilha, Bacon, Ovo, Alface e Tomate.");
    }

}