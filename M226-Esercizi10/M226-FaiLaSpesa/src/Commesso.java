import java.util.List;

public class Commesso {

    public void faiLaSpesa(List<Item> listaSpesa, double denaro)
    {
        double total = 0;
        double diff = total - denaro;
        for(Item i : listaSpesa)
        {
            total += i.getPrice();
        }
        if(total > denaro)
        {
            listaSpesa.add(new Item("Sidon", diff));
        }
    }
}
