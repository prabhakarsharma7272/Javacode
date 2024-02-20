import java.util.Scanner;
import java.util.Arrays;

public class first {
    // first takeinput a string 
    public static void s (int n ) {
        int a[]= new int[n];
        int i;
        for( i = 1; i<n; i++){
            Scanner sc = new Scanner(System.in);
            a[i]=sc.nextInt();
        }
        Arrays.sort(a, 1,n);
        for( i =1; i<n; i++){
            System.out.print(a[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s(n);
    }
    
}
