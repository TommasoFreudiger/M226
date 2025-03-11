public class Quadrato {
    public int side;
    public int area;
    public int perimetro;
    public String txt;
    public String square;

    public Quadrato(int side) {
        this.side = side;
    }

    public int getArea()
    {
        area = side * side;
        return area;
    }

    public int getPerimeter()
    {
        perimetro = side * 4;
        return perimetro;
    }

    public void draw() {
        for (int i = 0; i < side; i++)
        {
            for (int j = 0; j < side; j++)
            {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public String getDimension()
    {
        txt = ("Quadrato" + " " + side + " x " + side);
        return txt;
    }
}
