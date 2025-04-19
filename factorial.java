public class factorial {
    public static int fact(int num){
        if (num==0 || num==1) {
            return 1;
        }
        return num*fact(num-1);
    }
public static void main(String[] args) {
    System.out.println("programm is running");
    int factor=fact(5);
    System.out.println(factor);
}
}
