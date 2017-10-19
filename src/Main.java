import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i <= 50; i++) {
            integerSet.add(Randomize.Randomize());
        }

        int max = MaxValue.maxValue(integerSet);

        System.out.println("Minimalna wartość to: " + MinValue.minValue(integerSet, max));
        System.out.println("Maxymalna wartość to: " + max);

        double avarage = AverageCalculator.average(integerSet);

        System.out.println("Srednia arytmetyczna to: " + avarage);
        ValuesAboveAverage.valuesAboveAverage(integerSet, avarage);
    }
}