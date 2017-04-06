/**
 * Created by kirillk on 31.03.17.
 */
public class bubble_sort {
    public static void main(String [] args){
        int [] array = new int []{1, 10, 5, 8, 2, 7};
        bubble_sort(array);
        System.out.println(array);
    }
    public static void bubble_sort(int[] array){
        int i;
        int temp;
        for (i = 0; i < array.length; i++){
            for(int j=1; j < (array.length-i); j++){
                if(array[j-1] > array[j]){
                    //swap the elements!
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }
}
