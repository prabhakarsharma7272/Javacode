package DSA.Maths;

import java.util.Scanner;

public class palindrome {
    public static boolean third(int n){
        int y =n;
        int s =0;
        while(y>0){
            int r = y%10;   
            s = (s*10)+r;
            y= y/10;
        }
        
        if(s==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean x =third(n);
        System.out.println(4%8);
        sc.close();
    }
    
}
