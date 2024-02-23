package DSA;

import java.util.Scanner;

public class alphahill {
      public static void nalphahill(int n) {
       for (int i =0; i<n; i++){
        char a = 'A';
        for (int j=0; j<n-i-1; j++){
            System.out.print(" ");
        }
        for( int j =0; j<=i; j++){
            System.out.print((char)(a+j) +" ");
            
        }
        for( int j =i-1; j>=0; j--){
            System.out.print((char)(a+j) +" ");
        }
       
        System.out.println();
       }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        nalphahill(n);
    }
    
    
}
