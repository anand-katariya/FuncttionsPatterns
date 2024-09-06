package functions;
import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        palr(r);
        // System.out.println(isPrime(a));
    }

    // public static int fact(int n){
    //     int fact = 1;
    //     for(int i = 1; i<=n;i++){
    //         fact = fact * i;
    //     }
    //     return fact;
    // }

    // public static boolean prime(int n){
    //     boolean pr = true;
    //     for (int i = 2; i<n; i++ ){
    //         if (n%i==0){
    //             pr = false;
    //             break;
    //         }
    //     }
    //     return pr ;
    // }
    public static boolean isPrime(int n) {
        boolean pr = true;
        for(int i =2; i < n ; i++){
            if (n%i==0){
                pr = false;
                break;
        }
       
    }
    return pr;
    }
    public static int palr(int r){
        for(int i = 2; i<=r;i++){
            if( isPrime(i) == true){
                System.out.println(i);
            }
        }
        return 0;
    }
}
write a program to display the square of first 10 even no. 