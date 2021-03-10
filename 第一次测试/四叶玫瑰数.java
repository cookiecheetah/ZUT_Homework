import java.util.*;
 class helloworld
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	int n=in.nextInt();
    	if(n<1634) System.out.println("0");
    	else if(n<8207) System.out.println("1");
    	else if(n<9473) System.out.println("2");
    	else System.out.println("3");
    }
}

