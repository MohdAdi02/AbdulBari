public class Overriding
{
    static class Super
    {
        public void display()
        {
            System.out.println("Hello");
        }
    }
    static class Sub extends Super
    {
        public void display()
        {
            System.out.println("Hello Welcome");
        }
    }

}
