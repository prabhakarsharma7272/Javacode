package DSA.Maths;

public class prime {
    public static String isprime(int num){
        if(num<=1){
            return "NO";
        }
        for(int i =2; i<num; i++){
            if(num%i==0){
                return "NO";
            }
        }
        return "YES";
}

}
