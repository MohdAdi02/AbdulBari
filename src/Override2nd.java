public class Override2nd
{
    static class TV
    {
        public void switchOn() {
            System.out.println("TV is switched on");
        }
        public void changeChannel(){
            System.out.println("TV channel is changed");
        }
    }
    static class smartTv extends TV
    {
        public void switchOn() {
            System.out.println("Smrt TV is switched on");
        }
        public void changeChannel(){
            System.out.println("Smart TV channel is changed");
        }
        public void browse(){
            System.out.println("Smart TV is borwsing");
        }
    }
}
