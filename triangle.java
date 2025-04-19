public class triangle {

    public static void show1(){
        int number=5;
        for(int i=0; i<number;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void show2(){
        int number=5;
        for(int i=number; i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    public static void show3(){
        int number=5;
        for(int i=1; i<=number;i++){
            for(int j=number; j>=1;j--)
            {
             if(j<=i){
                System.out.print("*");
             }
             else{
                System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
    public static void show4(){
        int number=5;
        for(int i=1; i<=number;i++){
            for(int j=1; j<=number;j++)
            {
             if(j>=i){
                System.out.print("*");
             }
             else{
                System.out.print(" ");
             }
            }
            System.out.println();
        }
    }
    public static void show5(){
        int number=5;
        for(int i=1; i<=number;i++){
            for (int j = 1; j <=number - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // show1();
        // show2();
        // show3();
        // show4();
        // show5();
    }
    
}
