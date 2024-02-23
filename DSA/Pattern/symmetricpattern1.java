package DSA.Pattern;

import java.util.Scanner;

public class symmetricpattern1 {
    public static void pattern1(int n){
        for(int i =1; i<=n; i++ ){
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            for (int j =2*(n-i); j>=1; j--){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =2; i<=n; i++ ){
            for (int j =n-i+1; j>=1; j--){
                System.out.print("*");
            }
            for (int j =1; j<=2*(i-1); j++){
                System.out.print(" ");
            }
            for (int j =n-i+1; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern1(n);
        sc.close();

        
    }
    
}
