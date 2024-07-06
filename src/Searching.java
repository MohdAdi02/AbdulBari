import java.util.Scanner;

public class Searching
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int [] A = {2,34,43,21,54,45,67,76};
        int key;
        //System.out.println("Enter the elements in the array");
        System.out.println("Enter the key value ");
      //  A = new int[]{sc.nextInt()};
        key = sc.nextInt();
        for(int i=0;i<A.length; i++){
            if(key==A[i]){
                System.out.println("Element found at index "+i);
                System.exit(0);
            }
        }
        System.out.println("element not found");
    }
}
