public class Dynamicdispatch
{
    static class Superr{
        public void meth1(){
            System.out.println("Super meth1");
        }
        public void meth2(){
            System.out.println("Super meth2");
        }
    }
    static class Subb extends Superr{
        @Override
        public void meth2() {
            System.out.println("sub meth2");
        }
        public void meth3(){
            System.out.println("sub meth3");
        }
    }
}
