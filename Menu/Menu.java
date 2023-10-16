package Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Classe base representando um sanduiche
class Sanduiche {
    public String nome;
    private String temperatura;
    private double preco;

    public Sanduiche(String n, double p) {
        this.nome = n;
        this.preco = p;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return temperatura;
    }

    public double getPreco() {
        return preco;
    }

    public void desc() {
        System.out.println("Tipo: " + getTipo());
    }

    public void setPreco(double p) {
        this.preco = p;
    }

}

// Subclasse que herda de um sanduiche
class Frio extends Sanduiche {

    public Frio(String n, double p) {
        super(n, p);
    }

    @Override
    public void desc() {
        System.out.println(" | Servido Frio");
    }

}

// Subclasse que herda de um sanduiche
class Quente extends Sanduiche {

    public Quente(String n, double p) {
        super(n, p);
    }

    @Override
    public void desc() {
        System.out.println(" | Servido Quente");
    }

}


// Classe principal
public class Menu {

    public static void main(String[] args) {

        System.out.println("------------------------------------------------");  
        System.out.println("-------- T I P O S  D E  L A N C H E S ---------");
        System.out.println("------------------------------------------------"); 

        //Adicionando um Array
        List<Sanduiche> sanduiches = new ArrayList<>();
        sanduiches.add(new Frio("* Queijo",8.00));
        sanduiches.add(new Frio("* Presunto e Queijo", 10.00));
        sanduiches.add(new Frio("* Peito de Peru", 12.00));

        sanduiches.add(new Quente("* X-Salada", 15.00));
        sanduiches.add(new Quente("* X-Churrasco", 18.00));
        sanduiches.add(new Quente("* X-Tudo", 25.00));


        // Filtro para listar os Nomes, Temperatura e Preço dos Lanches Frios
        List<Sanduiche> frios = sanduiches.stream()
                .filter(sanduiche -> sanduiche instanceof Frio)
                .collect(Collectors.toList());

        System.out.println("LANCHES FRIOS");
        System.out.println("------------------------------------------------");

        frios.forEach(sanduiche -> {
            System.out.print(sanduiche.getNome() + " | R$ " + sanduiche.getPreco());
            sanduiche.desc();
        });

        // Filtro para listar os Nomes, Temperatura e Preço dos Lanches Quentes
        List<Sanduiche> quentes = sanduiches.stream()
                .filter(sanduiche -> sanduiche instanceof Quente)
                .collect(Collectors.toList());

        System.out.println("------------------------------------------------");
        System.out.println("LANCHES QUENTES");
        System.out.println("------------------------------------------------");

        quentes.forEach(sanduiche -> {
            System.out.print(sanduiche.getNome() + " | R$ " + sanduiche.getPreco());
            sanduiche.desc();
        });
        System.out.println("------------------------------------------------");
    }

}