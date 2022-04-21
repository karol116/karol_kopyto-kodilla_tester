import java.util.Random;

public class RandomNumbers {

    public int drawUntil5000() {
        Random random = new Random();
        int[] temp = new int[1000];
        int sum = 0;
        int i = 0;
        while (sum < 5000) {
            temp[i] = random.nextInt(31);
            sum = sum + temp[i];
            i++;
        }
        return sum;
    }

    public int biggestFigure(int[] numbers) {
        int xMax = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (xMax < numbers[j]) {
                xMax = numbers[j];
            }
        }
        return xMax;
    }

    public int leastFigure(int[] numbers) {
        int xMin = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (xMin > numbers[j]) {
                xMin = numbers[j];
            }
        }
        return xMin;
    }
}