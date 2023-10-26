import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    public static void main(String[] args) {

        System.out.println("-------- T I P O S  D E  L A N C H E S ---------\n");

        // Adicionando um Array
        List<Sanduiche> sanduiches = new ArrayList<>();
        sanduiches.add(new XSalada("X-Salada |", " Quente | R$", 10.00));
        sanduiches.add(new XTudo("X-Tudo |", " Quente | R$", 30.00));

        // Filtro para listar o Nome, Temperatura e Preço do X-Salada
        List<Sanduiche> xsalada = sanduiches.stream()
                .filter(sanduiche -> sanduiche instanceof XSalada)
                .collect(Collectors.toList());

        xsalada.forEach(sanduiche -> {
            System.out.print(sanduiche.getNome() + sanduiche.getTemperatura() + sanduiche.getPreco());
            sanduiche.descricao();
        });

        // Filtro para listar o Nome, Temperatura e Preço do X-Tudo
        List<Sanduiche> xtudo = sanduiches.stream()
                .filter(sanduiche -> sanduiche instanceof XTudo)
                .collect(Collectors.toList());

        System.out.println("------------------------------------------------");

        xtudo.forEach(sanduiche -> {
            System.out.print(sanduiche.getNome() + sanduiche.getTemperatura() + sanduiche.getPreco());
            sanduiche.descricao();
        });
        System.out.println("------------------------------------------------\n");
    }

}