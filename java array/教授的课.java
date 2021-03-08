import java.util.*;
public class helloworld
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
       int n,m,sum=0;
       String str=in.nextLine();
       String[] out=str.split(",");
       n = Integer.parseInt(out[0]);
       m = Integer.parseInt(out[1]);
       for(int i=0;i<n;i++){
           int a= in.nextInt();;
           if(a<=0) sum+=1;
       }
       if(sum>=m) System.out.println("NO");
       else System.out.println("YES");
    }
}