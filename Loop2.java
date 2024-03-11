import java.util.*;
import java.io.*;

class Loop2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int q =0; 
                int p =0;
            for(int j=0;j<n;j++){
                q=(int)(Math.pow(2,j))*b;
                p=p+a+q; 
                System.out.print(p + " ");
                a=0;
            }
            System.out.println(); 
            p=0;
        }
    }
}
