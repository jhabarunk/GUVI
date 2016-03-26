import java.util.*;
import java.util.Arrays;
public class calc{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int length=0;
        int ar[]=new int[100];
        int i=0;
        while(n>0){
            ar[i]=n%10;
            n=n/10;
            length++;
            i++;
        }
        int ar1[]=new int[length];
        for(i=0;i<length;i++)
			ar1[i]=ar[i];
        Arrays.sort(ar1);
        String num="";
        for(i=0;i<length-k;i++)
            num=num+ar1[i];
        System.out.println(num);
     }
}
