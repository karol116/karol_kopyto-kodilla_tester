import java.util.Random;

public class RandomNumbersNewVersion {

    int min = 31;
    int max = 0;

    public static void main(String[] args) {
        RandomNumbersNewVersion object = new RandomNumbersNewVersion();
        object.drawNumber();
        System.out.println(object.max);
        System.out.println(object.min);

    }

    public void drawNumber() {
        Random random = new Random();
        int sum = 0;
        int temp = 0;

        while (sum < 5000) {
            temp = random.nextInt(31);
            System.out.println(temp);
            getMin(temp);
            getMax(temp);
            sum += temp;
        }
    }

    private void getMax(int temp) {
        if (temp > max) {
            max = temp;
        }
    }

    private void getMin(int temp) {
        if (temp < min) {
            min = temp;
        }
    }
}