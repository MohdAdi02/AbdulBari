public class Rectangle
{
    private double lenght;
    private double breadth;
    public Rectangle()
    {
        lenght = 1;
        breadth = 1;
    }

    public double getLenght() {
        return lenght;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double b) {
        if(breadth>=0)
            breadth=b;
        else
            breadth=0;

    }

    public void setLenght(double l) {
        if(l>=0)
            lenght=l;
        else
            lenght=0;
    }

    public Rectangle(double l, double b)
    {
        lenght = l;
        breadth = b;
    }
    public Rectangle(double s)
    {
        lenght = breadth = s;
    }
    public  double area()
    {
         return getLenght()*getBreadth();
    }
}
