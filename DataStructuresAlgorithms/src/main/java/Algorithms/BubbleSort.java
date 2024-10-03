package Algorithms;

public class BubbleSort {

    public static int[] exampleArr = {6,90,2,4,18,753,31,7};

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[j] > arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int x : arr){
            System.out.print(x + ", ");
        }
        return arr;
    }

    public static void main(String[] args) {
        bubbleSort(exampleArr);
    }
}
