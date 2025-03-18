public class Cerchio {
    private double raggio;

    public Cerchio(double raggio)
    {
        this.raggio = raggio;
    }
    public double calcolaCirconferenza()
    {
        return Math.PI*2*raggio;
    }
    public double calcolaArea()
    {
        return Math.PI*raggio*raggio;
    }
    public String toString()
    {
        return "Raggio: " + raggio + "\n" + "Circonferenza: " + calcolaCirconferenza() + "\n" + "Area: "+calcolaArea();
    }
}
