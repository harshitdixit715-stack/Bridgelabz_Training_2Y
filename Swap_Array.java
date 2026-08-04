import java.util.Arrays;

public class Swap_Array {
    public static void Swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        display(arr);
        Swap(arr, 0, 1);
        System.out.println(Arrays.toString(arr));
    }
}