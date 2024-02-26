 package DSA.Maths;
import java.util.Scanner;
 public class test {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y =n;
        int s = 0;
        while(y>0){
            int r = y%10;
            s = (s*10)+r;
            y= y/10;
        }
        if(n==s){
           
            System.out.println("palindrome");
        }else{
          
            System.out.println("not a palindrome");
        }
       System.out.println(4%3);
    
        sc.close();
    }
}
    