package Algorithms;

public class SelectionSort {

    public static int[] exampleArr = {6,90,2,40,18,753,31,7};

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int lowest = arr[i];
            for (int j = i; j < arr.length - 1; j++){
                if (arr[j + 1] < lowest){
                    int temp = lowest;
                    lowest = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            arr[i] = lowest;
        }

        for (int x : arr){
            System.out.print(x + ", ");
        }
        return arr;
    }

    public static void main(String[] args) {
        selectionSort(exampleArr);
    }

}
