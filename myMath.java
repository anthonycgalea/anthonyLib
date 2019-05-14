import java.util.ArrayList;
import java.lang.Math;
public class myMath {

    public static double average(Double[] numbers) {
        double av = 0;
        int i = 0;
        for (double num : numbers) {
            av+=num;
            i++;
        }
        av/=i;
        return av;
    }

    public static double stdDev(Double[] numbers) {
        double mean = average(numbers);
        Double differences[] = new Double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            differences[i] = (mean - numbers[i])*(mean-numbers[i]);
        }
        return Math.sqrt(average(differences));
    }

    public static void main(String[] args) {
        Double[] numbers = new Double[5];
        numbers[0] = 3.0;
        numbers[1] = 5.0;
        numbers[2] = 1.0;
        numbers[3] = 0.0;
        numbers[4] = 6.0;
        double ave = average(numbers);
        double std = stdDev(numbers);
        System.out.println("Testing Functions:");
        System.out.println("Average:\t\t" + ave + "");
        System.out.println("Standard Deviation:\t" + std + "");
        return;
    }


}
