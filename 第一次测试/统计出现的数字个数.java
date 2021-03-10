import java.util.*;
public class helloworld
{
    public static void main(String[] args)
    {
    	Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        char[] c=s.toCharArray();
        int big=0,sma=0,num=0,etc=0;
        for(char ee:c) {
        	if(ee>='A'&&ee<='Z') {
        		big+=1;
        	}
        	else if(ee>='a'&&ee<='z') {
        		sma+=1;
        	}
        	else if(ee>='0'&&ee<='9') {
        		num+=1;
        	}else {
        		etc+=1;
        	}
        }
        System.out.println("数字有:"+num+"个");
    }
}
