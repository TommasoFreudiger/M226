import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        double denaro = 50;
        List<Item> listaSpesa = new ArrayList<>();

        Item item1 = new Item("Panino al salame", 10);
        Item item2 = new Item("Coscia di pollo", 30);
        listaSpesa.add(item1);
        listaSpesa.add(item2);

        Commesso commesso1 = new Commesso();

        Commesso.faiLaSpesa
    }
}