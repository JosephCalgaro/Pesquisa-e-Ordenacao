import java.util.HashSet;

public class ExemploHashSimples {
    public static void main(String[] args) {
        HashSet<String> tabelaString = new HashSet<>();
        tabelaString.add("alexandre");
        tabelaString.add("Hermes");
        tabelaString.add("Davi");
        tabelaString.add("Alan");
        tabelaString.add("Alexandre");
        System.out.println(tabelaString);

        for(String item : tabelaString) {
            System.out.println(item + " -> " + item.hashCode());;
        }

        System.out.println(tabelaString.contains("Alan") + " -> "+ "Alan".hashCode());
    }
}
