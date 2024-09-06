public class inv{
    public static void main(String[] args) {
    //  inv();
    //  Floyd();
        ZeroOne();
    }
    public static void Inv(){
        for(int i = 5; i>=1;i--){
            for(int j = 1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void Floyd(){
        int a=0;
        for(int i = 1; i<=5;i++){
            for (int j = 1; j<=i;j++){
                System.out.print(++a);
            }
            System.out.println();
        }
    }
    public static void ZeroOne(){
        int a=0;
        for(int i = 1; i<=5;i++){
            for (int j = 1; j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
