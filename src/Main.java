import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int result = 0;
        int max = arr[0];
        int min = arr[0];
        int month = 30;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int currentValue = arr[i];
            if (max < currentValue){
                max = currentValue;
            }
            if (min > currentValue){
                min = currentValue;
            }
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println("Сумма " + result);
        double middleValue = (double) result / month;
        System.out.println(middleValue);
        //example();
        task4();

    }
    public static void example() {
        int[] weights = {90, 60, 99, 95, 65, 98};
        int[] weightsCopy = {90, 60, 99, 95, 65, 98};
        boolean arrAreEqual = true;
        arrAreEqual = weights.length == weightsCopy.length;
        if (arrAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]){
                    arrAreEqual = false;
                }
            }
        }
        if (arrAreEqual){
            System.out.println("==");
        } else {
            System.out.println("!=");
        }

        int[] w = {90, 60, 95, 65};
        int r = -1;
        for (int current : w) {
            if (current > r) {
                r = current;
            }
        }
        System.out.println(r);
        for (int i = 0; i < w.length; i++) {

        }
    }
    public static void task4(){
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}