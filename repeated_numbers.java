import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
            ar[i]=s.nextInt();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            if(set.contains(ar[i]))
                System.out.println(ar[i]);
            else
                set.add(ar[i]);
        }
       
     }
}
