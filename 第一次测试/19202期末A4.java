import java.util.*;
public class Dog {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("");
		String strIn= s.next();
		System.out.println("");
		String strCh = s.next();

		boolean isCon=true; 
		if(!strIn.contains(strCh)){
		isCon=false;
		}
		if(isCon){
		System.out.print("");
		int preStrLength = 0;
		System.out.print("");
		while(true){
		int pos = strIn.indexOf(strCh);
		if(pos==-1)break;
		System.out.print((pos + preStrLength));
		System.out.print(' ');
		strIn= strIn.substring(pos +strCh.length() );
		preStrLength +=(pos +strCh.length());
		}
		}else{

		}
		}
}

