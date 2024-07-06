import java.util.Scanner;
public class Radix
{
    public static void main(String[]arg){
        Scanner sc =new Scanner(System.in);
        String num;
        System.out.println("enter the number");
        num =sc.nextLine();

        if(num.matches("[0-1234" +
                "1]+")){
            System.out.println("binary radix =2");
        }else if(num.matches("[0-7]+")){
            System.out.println("octal radix =8");
        } else if (num.matches("[0-9]+")) {
            System.out.println("decimal radix =10");
        }else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexa decimal radix =16");
        }else{
            System.out.println("number is invalid");
        }
    }

}
