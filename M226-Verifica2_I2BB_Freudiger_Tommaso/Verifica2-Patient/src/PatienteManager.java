import java.util.Random;

public class PatienteManager {
    public static void main(String[] args) {

        Random random = new Random();
        double avgAge = 0;
        double avgAgeEm = 0;
        double avgAgeAm = 0;
        double avgAgeRi = 0;

        System.out.printf("Welcome to Patient Manager!\n");

        Patient patient1 = new Patient("Tommaso", random.nextInt(100) + 1, patientType.EMERGENZA, "M");
        Patient patient2 = new Patient("Maria", random.nextInt(100) + 1, patientType.EMERGENZA, "F");
        Patient patient3 = new Patient("Marco", random.nextInt(100) + 1, patientType.AMBULATORIALE, "M");
        Patient patient4 = new Patient("Nicole", random.nextInt(100) + 1, patientType.AMBULATORIALE, "F");
        Patient patient5 = new Patient("Roberto", random.nextInt(100) + 1, patientType.RICOVERATO,"M");
        Patient patient6 = new Patient("Filomena", random.nextInt(100) + 1, patientType.RICOVERATO,"F");

        System.out.printf(patient1.getInfo() + "\n");
        System.out.printf(patient2.getInfo() + "\n");
        System.out.printf(patient3.getInfo() + "\n");
        System.out.printf(patient4.getInfo() + "\n");
        System.out.printf(patient5.getInfo() + "\n");
        System.out.printf(patient6.getInfo() + "\n");

        avgAge = (patient1.getAge() + patient2.getAge() + patient3.getAge() + patient4.getAge() + patient5.getAge() + patient6.getAge()) / 6.0;
        avgAgeEm = (patient1.getAge() + patient2.getAge()) / 2.0;
        avgAgeAm = (patient3.getAge() + patient4.getAge()) / 2.0;
        avgAgeRi = (patient5.getAge() + patient6.getAge()) / 2.0;

        System.out.printf("The average age of the patient is %.2f\n", avgAge);
        System.out.printf("EMERGENZA: The average age of the patient is %.2f\n", avgAgeEm);
        System.out.printf("AMBULATORIALE: The average age of the patient is %.2f\n", avgAgeAm);
        System.out.printf("RICOVERATO: The average age of the patient is %.2f\n", avgAgeRi);
    }
}