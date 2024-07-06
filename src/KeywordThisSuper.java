public class KeywordThisSuper
{
    static class Rectangle
    {
        int lenght;
        int breadth;
        int x =10;
        Rectangle(int l, int b)
        {
            this.lenght = l;
            this.breadth = b;

        }
        public void display()
        {
            System.out.println("Lenght: "+this.lenght);
        }

    }
}
