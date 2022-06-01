
public class RandomNumber {
    public static void main(String[] args) {

        float sum = 0;
        for (int i = 0; i <= 5; i++) {
            int random = (int) ((Math.random() * 10) * 1);

            System.out.println(random);

            sum = sum + random;
        }
        System.out.println("sum of random numbers is " + sum);
        float avg = sum / 5;
        System.out.println("Average value is" + avg);

    }

}

