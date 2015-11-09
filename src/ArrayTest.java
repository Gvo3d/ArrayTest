/**
 * Created by ITHILLEL7 on 09.11.2015.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(sum(arr));
    }

    public static int sum(int[] array){
        int sum=0;
        for (int el : array){
            sum += el;
        }
        return sum;
    }
}
