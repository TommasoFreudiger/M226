public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta)
    {
        if (nome.length()<3){
            throw new IllegalArgumentException("Nome non valido. Deve essere lungo almeno 3 caratteri.");
        }
        this.nome = nome;
        if (cognome.length()<3){
            throw new IllegalArgumentException("Cognome non valido. Deve essere lungo almeno 3 caratteri.");
        }
        this.cognome = cognome;
        if (eta>100 || eta<0)
        {
            throw new IllegalArgumentException("Età non valida. Deve essere compresa tra 0 e 100.");
        }
        this.eta = eta;
    }
}
