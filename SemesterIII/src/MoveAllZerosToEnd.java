import java.util.Arrays;
import java.util.Scanner;

public class MoveAllZerosToEnd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {0,2,0,3,0,3,3,3,3};
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
