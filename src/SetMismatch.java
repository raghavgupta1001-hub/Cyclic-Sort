import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        int[] arr  = {1,2,2,4};
        System.out.println(missingNumber(arr));
    }

    public static int[] missingNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {

                i++;
            }
        }
        // search for 1st missing no
        for (int index = 0; index < arr.length ; index++) {
            if(arr[index] != index + 1){
                return new int[] {arr[index], index + 1};
            }
        }
        // case 2
        return new int[] {-1,-1};
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
