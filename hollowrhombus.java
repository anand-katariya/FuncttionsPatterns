public class hollowrhombus {
    public static void main(String[] args) {
        HollowRhombus(5);    
    }
    public static void HollowRhombus(int n ){
        for(int i = 1; i<= n; i++){
            for (int j = 1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int x=1; x<=n;x++){
                
                    if(x == 1 || x == n || i==1 || i == n ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
