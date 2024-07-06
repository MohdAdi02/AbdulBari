public class Cylinder
{
    private int radius;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getRadius() {
        return radius;
    }
    public int setHeight(int h) {
        if (h >= 0)
            height = h;
        else
            height = 0;
        return h;
    }
    public int setRadius(int r) {
        if(r>=0)
            radius = r;
        else
            radius=0;
        return r;
    }
    public Cylinder()
    {
        radius=0;
        height=0;
    }
    public Cylinder(int r){
        height=2;
    }
    public Cylinder(int r, int h)
    {
        radius= r;
        height= h;
    }
    public double volume()
    {
        return Math.PI*radius*radius*height;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
}
