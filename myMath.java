import java.lang.Math;
import java.util.ArrayList;
public class myMath {

    public static double average(ArrayList<Double> numbers) {
        double av = 0;
        int i = 0;
        for (double num : numbers) {
            av+=num;
            i++;
        }
        av/=i;
        return av;
    }

    public static double variance(ArrayList<Double> numbers) {
        double mean = average(numbers);
        ArrayList<Double> differences = new ArrayList<Double>();
        for (int i = 0; i < numbers.size(); i++) {
            differences.add(mean - numbers.get(i)*(mean-numbers.get(i)));
        }
        return average(differences);
    }

    public static double stdDev(ArrayList<Double> numbers) {
        return Math.sqrt(variance(numbers));
    }

    public static double findMin(ArrayList<Double> numbers) {
        double min;
        if (numbers.size() > 0) {
        min = numbers.get(0);
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

    public static double findMax(ArrayList<Double> numbers) {
        double max;
        if (numbers.size() > 0) {
        max = numbers.get(0);
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
        ArrayList<Double> numbers = new ArrayList<Double>();
        numbers.add(3.0);
        numbers.add(5.0);
        numbers.add(1.0);
        numbers.add(0.0);
        numbers.add(6.0);
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
