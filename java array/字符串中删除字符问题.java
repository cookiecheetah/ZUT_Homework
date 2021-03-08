import java.util.*;
public class helloworld
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s=in.next();
        String a=in.next();
        char[]  c = s.toCharArray();
        char[]  b = a.toCharArray();
        for(int i=0;i<s.length();i++){
            if(b[0]!=c[i]) System.out.print(c[i]);
        }
    }
}