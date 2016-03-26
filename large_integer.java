import java.util.*;
import java.util.Arrays;
public class HelloWorld{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=s.nextInt();
        Arrays.sort(ar);
        String num="";
        for(int i=n-1;i>=0;i--)
            num=num+Integer.toString(ar[i]);
        System.out.println(num);
     }
}
