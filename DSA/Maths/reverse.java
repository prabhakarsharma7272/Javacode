package DSA.Maths;

import java.util.Scanner;

public class reverse {
    public static void second(int n){
        String b ="";
        int t =n;
        while(t>0){
            int r = t%2;
            t = t/2;
            b= r+b;

        } 
        System.out.println(b);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    second(n);
    sc.close();
}
    
}
