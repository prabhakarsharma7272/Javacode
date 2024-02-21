import java.util.Arrays;
import java.util.Scanner;

public class third {
    //chage input string into array of string 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] d = s.split(",");
        Arrays.sort(d);

        // System.out.println("Array of String");
        // for(String str : d){
        //     System.out.println(str);
        // }
        // sc.close();
        for(int i =d.length-1; i>=0; i--){
            System.out.println(d[i]);
        }

    }
    
}
