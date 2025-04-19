public class array {

    public static int[] arrayInsertion(int[] array,int element){
        int arraylength=array.length;
        int [] newarray= new int[arraylength+1];
        for(int i=0; i<arraylength;i++){
            newarray[i]=array[i];
        }
        newarray[arraylength]=element;
        return newarray;
    }

    
    public static void main(String[] args) {
        System.out.println("program is running");
         int [] array={1,2,3,4,5,6,7};
         System.out.println(array.length);
          for(int i:array){
            System.out.println(i);
          }
          int [] newarray=arrayInsertion(array, 23);
          for(int j: newarray){
            System.out.println(j);
          }
    }
}
