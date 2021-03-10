import java.util.*;
 class helloworld
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	int n=in.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=in.nextInt();
		}
		Arrays.sort(num);
		for(int i=n-1;i>=0;i--) {
				System.out.print(num[i]+" ");
		}
    }
}
