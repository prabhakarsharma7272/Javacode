import java.util.Scanner;
import java.util.Arrays;



public class Second {
    // first takeinput a strinh 
    public static void s (int n ) {
        String a[]= new String[n];
        int i;
        for( i = 0; i<n; i++){
            Scanner sc = new Scanner(System.in);
            a[i]=sc.nextLine();
            sc.close();
        }
        Arrays.sort(a);
       
        
        for( i =0; i<n; i++){
            System.out.print(a[i] +" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s(n);
        sc.close();
    }
    
}
