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

    public static double variance(Double[] numbers) {
        double mean = average(numbers);
        Double differences[] = new Double[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            differences[i] = (mean - numbers[i])*(mean-numbers[i]);
        }
        return average(differences);
    }

    public static double stdDev(Double[] numbers) {
        return Math.sqrt(variance(numbers));
    }

    public static double findMin(Double[] numbers) {
        double min;
        if (numbers.length > 0) {
        min = numbers[0];
        for (double number : numbers) {
            if (number < min) {
                min = number;
                }
            }
        }
        else {
            min = 0;
        }   
        return min;
    }

    public static double findMax(Double[] numbers) {
        double max;
        if (numbers.length > 0) {
        max = numbers[0];
        for (double number : numbers) {
            if (number > max) {
                max = number;
                }
            }
        }
        else {
            max = 0;
        }   
        return max;
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
        double vari = variance(numbers);
        double min = findMin(numbers);
        double max = findMax(numbers);
        System.out.println("Testing Functions:");
        System.out.println("Average:\t\t" + ave + "");
        System.out.println("Variance:\t\t" + vari + "");
        System.out.println("Standard Deviation:\t" + std + "");
        System.out.println("Minimum:\t\t" + min + "");
        System.out.println("Maximum:\t\t" + max + "");
        return;
    }


}
