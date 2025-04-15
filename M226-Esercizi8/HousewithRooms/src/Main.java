/**
 * Java Main instanza le classi
 */

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(10.0, "camera1", RoomType.KITCHEN);
        Room room2 = new Room(7.5, "camera2", RoomType.BATHROOM);
        House house1 = new House("Prestiter 041");
        house1.addRoom(room1);
        house1.addRoom(room2);
        house1.showHouse();
        house1.superficieHouse();
    }
}