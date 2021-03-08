import java.util.*;
public class helloworld
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,sum=0;
        n=in.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                int a=in.nextInt();
                if(j<=i) sum+=a;
            }
        }
        System.out.println(sum);
    }
}