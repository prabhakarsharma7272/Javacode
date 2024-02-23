package DSA.Pattern;

import java.util.Scanner;

public class alphahill3 {
    public static void reversealpha(int n){
        for (int i =0; i<n; i++){
            for(int j = n; j>=n-i; j--){
                System.out.print((char)(64+j)+ " ");
            }
            System.out.println();
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reversealpha(n);
        sc.close();


    }
    
}
