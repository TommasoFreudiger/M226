/**
 * Classe Room fa vedere le camere
 */

public class Room {
    private String nome;
    private double superficie;
    private RoomType roomtype;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public Room(double superficie, String nome, RoomType roomtype) {
        this.superficie = superficie;
        this.nome = nome;
        this.roomtype = roomtype;
    }

    @Override
    public String toString() {
        return "Room{" +
                "nome='" + nome + '\'' +
                ", superficie=" + superficie +
                ", roomtype=" + roomtype +
                '}';
    }
}