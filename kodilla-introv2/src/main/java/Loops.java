
public class Loops {
    public static void main(String[] args) {
        int[] count = new int[]{12, 23, 43, 423, 2, 11};

        sumNumbers(count);
    }

    public static int sumNumbers(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
            System.out.println(numbers[i]);
        }
        return result;
    }
}