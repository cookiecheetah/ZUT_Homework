import java.util.*;
public class helloworld
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] num=new int[10];
        int m=in.nextInt();
        for(int i=0;i<num.length;i++){
            num[i]=in.nextInt();
        }
        m=m%10;
        for(int i=10-m;i<10;i++) System.out.print(num[i]+" ");
        for(int i=0;i<10-m;i++) if(i!=10-m-1)System.out.print(num[i]+" ");else System.out.print(num[i]);
    }
}