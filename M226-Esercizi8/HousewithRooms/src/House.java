/**
 * Classe House fa vedere la casa
 */

import java.util.ArrayList;
import java.util.List;

public class House {
    private String indirizzo;
    private List<Room> rooms = new ArrayList<>();

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public House(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void showHouse() {
        String output  = "Indirizzo: " + indirizzo + "\n";
        for (Room room : rooms) {
            output += room.toString() + "\n";
        }
        System.out.println(output);
    }

    public void superficieHouse() {
        double superficietotale  = 0;
        for (Room room : rooms) {
            superficietotale += room.getSuperficie();
        }
        System.out.println("Superficie Totale: " + superficietotale);
    }
}

