import java.util.*;
 class helloworld
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
    	for(int i=1;i<=4;i++) {
    		int[] num=new int[4];
    		int xb=0;
    		int zd=-9;
    		for(int j=0;j<4;j++) {
    			num[j]=in.nextInt();
    			if(zd<num[j]) {
    				xb=j;
    				zd=num[j];
    			}
    		}
    		int t=num[xb];
    		num[xb]=num[0];
    		num[0]=t;
    		System.out.println(num[0]+" "+num[1]+" "+num[2]+" "+num[3]+" ");
    	}
    }
}

