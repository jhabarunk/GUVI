import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=s.nextInt();
        for(int i=0;i<n;i++){
            if(ar[i]==i)
                System.out.println(ar[i]);
        }
     }
}
