public class arrayinsertion {
    private static int [] array ; 
    private static int size;
    private static int [] oddArray;
    private static int [] evenArray;
    public static int [] arrayInsertion(int [] arr, int element){
        array=new int[arr.length+1];
        for(int i=0; i<arr.length; i++){
            array[i]=arr[i];
        }
        array[arr.length]=element;
        return array;
    }

    public static int[] oddData(int [] arr){
        oddArray=new int[arr.length];
        for(int i=0; i<arr.length;i++){
            if((arr[i]%2)!=0){
                oddArray[i]=arr[i];
            }
        }
        return oddArray;
    }
    public static int[] evenData(int [] arr){
        evenArray=new int[arr.length];
        for(int i=0; i<arr.length;i++){
            if((arr[i]%2)==0){
                evenArray[i]=arr[i];
            }
        }
        return oddArray;
    }
    
    public static int[] deletionIndexed(int index){
        if(index<0||index>=size||size==0){
            return array;
        }

        // int []temparray=new int[array.length-1];
        // int temp=0;

        // for(int i=0; i<array.length;i++){
        //     if(i==index){
        //          continue;
        //     }
        //     temparray[temp++]=array[i];
        // }
        // array=temparray;

        for(int i=index;i<array.length-1;i++){
            array[i]=array[i+1];
        }
        size--;

        return array;
    }
    public static void main(String[] args) {
        System.out.println("program is running");
        int []arr={1,2,3,4,5,6};
        arrayInsertion(arr,9);
        size=array.length;
        oddData(array);
        evenData(array);
        deletionIndexed(4);
        for (int i : array) {
            System.out.println(i);
        }
        // for (int i : oddArray) {
        //     System.out.println(i);
        // }
        // for (int i : evenArray) {
        //     System.out.println(i);
        // }
    }
}
