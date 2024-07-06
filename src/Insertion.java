//insert an element in a given index of an array
public class Insertion {
    public static void main(String []args){
        int [] A= new int[10];
        A[0]=1;
        A[1]=22;
        A[2]=13;
        A[3]=40;
        A[4]=11;
        A[5]=21;
        int n=6;
        for(int i =0;i<n;i++){
            System.out.println(A[i]);
        }

        int index=3;
        int x=14;
        for(int i=n; i>index;i--)
            A[i]=A[i-1];

        A[index]=x;
        for(int j=0; j<n+1;j++){
            System.out.println(A[j]);
        }



    }
}
