package DSA;
import java.util.Scanner;

public class symmetricpattern {
    public static void pattern(int n){
        for(int i =0; i<n; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*i; j++){
                System.out.print(" ");
            }
            for(int j =1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =0; i<n; i++){
            for(int j =n; j>=n-i; j--){
                System.out.print("*");
            }
            for(int j=2*(n-i-1); j>=1; j--){
                System.out.print(" ");
            }
            for(int j =n; j>=n-i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern(n);
        sc.close();
        
    }
    
}
//* * * * * *
//* *     * *
//*         *
//* * * * * *
//* *     * *
//*         *