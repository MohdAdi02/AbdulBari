import java.awt.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Overriding.Super su = new Overriding.Super();
        su.display();

        Overriding.Sub sb = new Overriding.Sub();
        sb.display();

        Overriding.Super sup = new Overriding.Sub(); // there method will be called depending on the object not upon the reference
        sup.display();
        // this is called  dynamic method dispatch


        Override2nd.TV t= new Override2nd.TV();
        t.changeChannel();
        t.switchOn();


       Override2nd.smartTv tv = new Override2nd.smartTv();
        tv.browse();


        Dynamicdispatch.Superr s = new Dynamicdispatch.Subb();
        s.meth1();
        s.meth2();

        Dynamicdispatch.Subb sbb = new Dynamicdispatch.Subb();
        sbb.meth2();
        sbb.meth1();



        Rectangle r = new Rectangle(10,5);

        System.out.println("Area:"+r.area());


        Cylinder cy = new Cylinder();
        cy.setRadius(3);
        System.out.println("Radius is :"+cy.getRadius());
        System.out.println("volume of a Cylinder :" +cy.volume());
        System.out.println("Perimeter of a cylunder :"+cy.perimeter());

        Radix rad =new Radix();
        Scanner sc=new Scanner(System.in);
        String num;
        System.out.println("Enter the number");
        num = sc.nextLine();
    }
}