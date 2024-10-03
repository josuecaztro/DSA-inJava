package Algorithms;

public class SelectionSort {

    public static int[] exampleArr = {6,90,2,4,18,1,753,31,7};

    public static int[] selectionSort(int[] arr){
        int low;
        for (int i = 0; i < arr.length; i++){
            low = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[low]){
                    low = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[low];
            arr[low] = temp;
        }
        //PRINT NEW SORTED ARRAY
        for (int x : arr){
            System.out.print(x + ", ");
        }
        return arr;
    }

    public static void main(String[] args) {
        selectionSort(exampleArr);
    }

}
