package Algorithms;


public class QuickSort {

    public static int[] exampleArr = {6,90,2,4,18,753,31,7};

    public static void quickSort(int[] arr, int begin, int end){
       if (begin < end){
           int index = partition(arr, begin, end);
           partition(arr, begin, index - 1);
           partition(arr, index + 1, end);
       }
    }

    public static int partition(int[] arr, int begin, int end){
        int pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        quickSort(exampleArr, 0, exampleArr.length - 1);
        for (int x : exampleArr){
            System.out.print(x + ", ");
        }
    }

}
