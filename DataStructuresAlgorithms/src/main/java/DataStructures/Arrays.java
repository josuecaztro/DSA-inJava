package DataStructures;

public class Arrays {

    public static int[] exampleArray = {5, 90, 23, 4, 17, 834, 38, 2};

    public static int findLowestValue(int[] arr){
        int solution = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < solution){
                solution = arr[i];
            }
        }
        System.out.println("The lowest value is: " + solution);
        return solution;
    }

    public static void main(String[] args) {
        findLowestValue(exampleArray);
    }

}
