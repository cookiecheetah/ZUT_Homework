import java.util.*;
public class helloworld
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] num=new int[10];
        for(int i=0;i< num.length;i++){
            num[i]=in.nextInt();
        }
        int n=in.nextInt();
        for(int i=0;i<num.length;i++){
            if(num[i]==n){
                System.out.println("found:"+(i+1));
                return;
            }
        }
        System.out.println("-1");
    }
}