public class Main {

    public static void main(String[] args) {

        int[] numbers = {3, 1, 5, 6, 7, 9, 15, 3, 4, 7, 10};
        System.out.println(returnMin(numbers));
        System.out.println(returnMax(numbers));

    }

    public static int returnMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int temp = 0;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int returnMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int temp = 0;

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

}
