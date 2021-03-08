import java.util.*;
public class helloworld
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[][] num=new int[4][4];
        int bb=0;
        int x=0,y=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                num[i][j]=in.nextInt();
                if(bb<num[i][j]){
                    bb=num[i][j];
                    x=i;y=j;
                }
            }
        }
        System.out.println(bb+","+x+","+y);
    }
}