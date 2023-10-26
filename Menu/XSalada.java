public class XSalada extends Sanduiche {

    public XSalada(String n, String t, double p) {
        super(n, t, p);
    }

    @Override
    public void descricao() {
        System.out.println(" | Ingredientes: Pão, Hambúrguer, Queijo, Presunto, Alface e Tomate.");
    }

}
