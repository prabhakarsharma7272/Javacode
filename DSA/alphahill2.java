package DSA;
import java.util.Scanner;

public class alphahill2 {
    public static void reversealpha(int n){
        for (int i =0; i<n; i++){
            for(int j = n-i; j<=n; j++){
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
