package functions;
import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decToBin(n);
    }
    public static int binToDec(int n) {
        int pow = 0;
        int dec = 0;
        while (n>0){
            int LD = (n%10);
            dec = dec+ (LD *(int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.print(dec);
        
        return 0;
    }
    public static int decToBin(int n ){
        int bin =0;
        int pow =0;
        while (n>0){
            int rem = n %2;
            bin = bin +(rem * (int)Math.pow(10,pow));
            pow++;
            n= n/2;
        
        }
        System.out.println(bin);
        return 0;
    }
}
