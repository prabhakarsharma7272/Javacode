
package DSA.Pattern;
import java.util.Scanner;

public class nlettertriangle {
    
    public static void nLetterTriangle(int n) {
        // Write your code here
        char a = 'A';
      for (int i =1; i<=n; i++){
        for (int j = 1; j<=i; j++ ){
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
      }

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        nLetterTriangle(n);
    }
}


