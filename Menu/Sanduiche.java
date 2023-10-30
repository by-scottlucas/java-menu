package Menu;

public class Sanduiche {
    public String nome;
    private String temperatura;
    private double preco;

    // Método Construtor
    public Sanduiche(String n, String t, double p) {
        this.nome = n;
        this.temperatura = t;
        this.preco = p;
    }

    // Métodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void descricao() {
        System.out.println("Ingredientes do Sanduiche");
    }

}
