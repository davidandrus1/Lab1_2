import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static int calculateMax(int[] array){
        int max =  0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int calculateMin(int[] array){
        int min = 99999;
        for(int i = array.length - 1; i > 0; i--){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    public static int calculateMaxSum(int[] array){
        int maxSum = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                int aux = array[i];
//                array[i] = array[i + 1];
//                array[i + 1] = aux;
//            }
//        }
        Arrays.sort(array);
        for(int i = 1; i < array.length; i++){
            maxSum = maxSum + array[i];
        }

        return maxSum;
    }

    public static int calculateMinSum(int[] array){
        int minSum = 0;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] > array[i + 1]) {
//                int aux = array[i];
//                array[i] = array[i + 1];
//                array[i + 1] = aux;
//            }
//        }
        Arrays.sort(array);
        for(int i = 0; i < array.length - 1; i++){
            minSum = minSum + array[i];
        }

        return minSum;
    }


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Geben sie die Lange des Arrays an: ");

        int n = input.nextInt();

        int[] array = new int[n];

        System.out.print("Geben sie " + n + " Zahlen an.");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }

        int max = calculateMax(array);
        System.out.println("Das Maximum ist : "+ max);
        int min = calculateMin(array);
        System.out.println("Das Minimum ist : "+ min);

        int maxSum = calculateMaxSum(array);
        System.out.println("Die maximale Summe ist : "+maxSum);
        int minSum = calculateMinSum(array);
        System.out.println("Die minimale Summe ist : "+minSum);

    }
}
