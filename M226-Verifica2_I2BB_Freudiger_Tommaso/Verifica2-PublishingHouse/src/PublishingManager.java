import java.util.Scanner;

public class PublishingManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int scelta;
        int libro;
        System.out.printf("Welcome to Publishing Manager!\n");

        Book book1 = new Book("La verifiva di java", "Giorgio", "fantasy", 7);
        Book book2 = new Book("La ssd scomparsa", "David", "comic", 1);
        Book book3 = new Book("Il salto dalla finestra", "Francesco", "romance", 13);
        Book book4 = new Book("La verifica di java 2 la vendetta", "Giorgio", "fantasy", 4);

        PublishingHouse house1 = new PublishingHouse("Libri belli", "Via Trevano 13");
        PublishingHouse house2 = new PublishingHouse("Libri bellissimi", "Via Belli 21");

        while (true) {
            System.out.print("Scegli cosa vuoi fare:\n 0 = Mostra dati Publishing House\n 1 = Mostra dati Libri\n 2 = Aumenta Stock di un Libro");
            scelta = Integer.parseInt(scanner.nextLine());
            if (scelta == 0) 
            {
                System.out.printf(house1.toString() + "\n");
                System.out.printf(house2.toString() + "\n");
            } 
            else if (scelta == 1) 
            {
                System.out.printf(book1.toString() + "\n");
                System.out.printf(book2.toString() + "\n");
                System.out.printf(book3.toString() + "\n");
                System.out.printf(book4.toString() + "\n");
            }
            else if (scelta == 2)
            {
                System.out.print("Scegli il Libro:\n 0 = La verifica di java\n 1 = La ssd scomparsa\n 2 = Il salto dalla finestra\n 3 = La verifica di java 2 la vendetta\n");
                libro = Integer.parseInt(scanner.nextLine());
                if(libro == 0){ book1.addStock();
                    System.out.printf(book1.getStock().toString() + "\n"); }
                else if(libro == 1){ book2.addStock();
                    System.out.printf(book1.getStock().toString() + "\n"); }
                else if(libro == 2){ book3.addStock();
                    System.out.printf(book1.getStock().toString() + "\n"); }
                else if(libro == 3){ book4.addStock();
                    System.out.printf(book1.getStock().toString() + "\n"); }
            }

        }
    }
}