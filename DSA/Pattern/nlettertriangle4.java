package DSA.Pattern;

import java.util.Scanner;

public class nlettertriangle4 {
    public static void nLetterTriangle4(int n) {
        char a = 'A';
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(a + " ");
            }
            a++;
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        nLetterTriangle4(n);
    }
    
}
