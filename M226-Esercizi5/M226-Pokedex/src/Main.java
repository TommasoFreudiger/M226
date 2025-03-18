//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int aumentoB = Integer.parseInt(args[0]);
        int aumentoM = Integer.parseInt(args[1]);

        Pokedex pokedex = new Pokedex("rosso", "20x20", "Kalos", 6, 100, 100);

        System.out.println("|--------------------------------------------------------------------------------|");
        System.out.println("| Colore      | Dimensione      | Regione    | Generazione | Memoria | Batteria  |");
        System.out.println("|--------------------------------------------------------------------------------|");
        System.out.println("| " + pokedex.colore + "       | " + pokedex.dimensione + "           | " + pokedex.regione + "      | " + pokedex.generazione + "           | " + pokedex.memoria + "     | " + pokedex.batteria + "       |");
        System.out.println("|--------------------------------------------------------------------------------|");

        if(aumentoB > 1) {
            for (int i = 0; i < aumentoB; i++) {
                pokedex.ricaricaPokedex();
            }
            System.out.println("Aumento batteria: " + aumentoB);
            System.out.println("|--------------------------------------------------------------------------------|");
            System.out.println("| Colore      | Dimensione      | Regione    | Generazione | Memoria | Batteria  |");
            System.out.println("|--------------------------------------------------------------------------------|");
            System.out.println("| " + pokedex.colore + "       | " + pokedex.dimensione + "           | " + pokedex.regione + "      | " + pokedex.generazione + "           | " + pokedex.memoria + "     | " + pokedex.batteria + "       |");
            System.out.println("|--------------------------------------------------------------------------------|");
        }
        if(aumentoM > 1) {
            for (int i = 0; i < aumentoM; i++) {
                pokedex.espandiMemoria();
            }
            System.out.println("Aumento memoria: " + aumentoM);
            System.out.println("|--------------------------------------------------------------------------------|");
            System.out.println("| Colore      | Dimensione      | Regione    | Generazione | Memoria | Batteria  |");
            System.out.println("|--------------------------------------------------------------------------------|");
            System.out.println("| " + pokedex.colore + "       | " + pokedex.dimensione + "           | " + pokedex.regione + "      | " + pokedex.generazione + "           | " + pokedex.memoria + "     | " + pokedex.batteria + "       |");
            System.out.println("|--------------------------------------------------------------------------------|");
        }
    }
}