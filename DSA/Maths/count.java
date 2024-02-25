package DSA.Maths;

import java.util.Scanner;

public class count {
    public static void first(int n){
        int x = n; 
        int count =0;
        while (x>0) {
           int y = x%10;
           if ( y !=0 && n%y==0) {
            count++;
           }
           x=x/10;
            
        }
        System.out.println(count);
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        first(n);
        sc.close();
    }
    
}
