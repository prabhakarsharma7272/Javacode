package DSA.Array;

import java.util.Scanner;

public class largestnumber {
    public static void large(int n){
        int x [] = new int[n];
        int larg=0;
        Scanner sc = new Scanner(System.in);
        for (int i =0; i<n; i++){
            
            x[i]=sc.nextInt();
        }
        for(int i =0; i<n; i++){
            if(x[i]>larg){
                larg=x[i];
            }
        }
        System.out.println(larg);
        sc.close();
        
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        large(n);
   
    }
}
