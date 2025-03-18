public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double calcolaDistanza()
    {
        return Math.sqrt(Math.pow(this.x - this.y, 2) + Math.pow(this.y - this.x, 2));
    }
    public String determinaQuadrante()
    {
        if(x > 0 && y > 0)
        {
            return "Primo Quadrante";
        }
        else if(x < 0 && y > 0)
        {
            return "Secondo Quadrante";
        }
        else if(x < 0 && y < 0)
        {
            return "Terzo Quadrante";
        }
        else if(x > 0 && y < 0)
        {
            return "Quarto Quadrante";
        }
        else
        {
            return "Nessun Quadrante";
        }
    }
    public String toString()
    {
        return "Coordinate: (" + x + ", " + y + ") - Distanza dal centro: " + calcolaDistanza() + " - Quadrante: " + determinaQuadrante();
    }
}
