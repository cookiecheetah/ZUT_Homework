import java.util.*;
 class helloworld
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	while(true) {
    		int n,m;
    		n=in.nextInt();
    		m=in.nextInt();
    		int[] num=new int[n+1];
    		if(n==0&&m==0) return;
    		for(int i=0;i<n;i++) {
    			num[i]=in.nextInt();
    		}
    		num[n]=m;
    		Arrays.sort(num);
    		for(int i=0;i<=n;i++) {
    			if(i!=n)
    				System.out.print(num[i]+" ");
    			else System.out.println(num[i]);
    		}
    	}
    }
}
