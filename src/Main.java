import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


class Main {
    public static int calculate_max(int[] array){
        int max =  0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int calculate_min(int[] array){
        int min = 99999;
        for(int i = array.length - 1; i > 0; i--){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }


    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Geben sie die Lange des Arrays an: ");

        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Geben sie " + n + " Zahlen an.");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }

        int max = calculate_max(array);
        System.out.println("Das Maximum ist : "+ max);
        int min = calculate_min(array);
        System.out.println("Das Minimum ist : "+ min);

    }
}
