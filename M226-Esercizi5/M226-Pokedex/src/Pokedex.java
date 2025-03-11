public class Pokedex {
    public String colore;
    public String dimensione;
    public String regione;
    public int generazione;
    public int memoria;
    public int batteria;

    public Pokedex(String colore, String dimensione, String regione, int generazione, int memoria, int batteria) {
        this.colore = colore;
        this.dimensione = dimensione;
        this.regione = regione;
        this.generazione = generazione;
        this.memoria = memoria;
        this.batteria = batteria;
    }

    public int ricaricaPokedex()
    {
        this.batteria++;
        return batteria;
    }

    public int espandiMemoria()
    {
        this.memoria++;
        return memoria;
    }
}
