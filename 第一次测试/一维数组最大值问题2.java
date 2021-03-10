import java.util.*;
 class helloworld
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	int[] num=new int[10];
    	int maxx=-99,xb=0;
    	for(int i=0;i<10;i++) {
    		num[i]=in.nextInt();
    		if(num[i]>maxx) {
    			xb=i;
    			maxx=num[i];
    		}
    	}
    	int t=num[9];
    	num[9]=num[xb];
    	num[xb]=t;
    	for(int i=0;i<10;i++) System.out.print(num[i]+" ");
    }
}

