//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pokedex pokedex = new Pokedex("rosso", "20x20", "Kalos", 6, 100, 100);

        System.out.println("|--------------------------------------------------------------------------------|");
        System.out.println("| Colore      | Dimensione      | Regione    | Generazione | Memoria | Batteria  |");
        System.out.println("|--------------------------------------------------------------------------------|");
        System.out.println("| " + pokedex.colore + "       | " + pokedex.dimensione + "           | " + pokedex.regione + "      | " + pokedex.generazione + "           | " + pokedex.memoria + "     | " + pokedex.batteria + "       |");
        System.out.println("|--------------------------------------------------------------------------------|");
        
    }
}