package functions;
import java.util.Scanner;

public class patterns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        holllowRectangle(a, b);
        
    }

    public static void holllowRectangle(int x, int y){
        for(int i = 1;i<=x; i++){
            for(int j = 1; j<=y; j++){
                if(i==1 ||i==x||j==1|| j==y){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}

