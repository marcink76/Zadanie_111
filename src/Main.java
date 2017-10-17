import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        int sum = 0;
        double average = 0;

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i <= 50; i++) {
            integerSet.add(Randomize.Randomize());
        }

        Iterator<Integer> integerIterator = integerSet.iterator();
        while (integerIterator.hasNext()) {
            int temp = integerIterator.next();
            if (temp > max) {
                max = temp;
            }
        }
        min = max;
        System.out.println("Maksymalna liczba to: " + max);

        for (Integer i : integerSet) {

            if (i < min) {
                min = i;
            }
        }
        System.out.println("Najmniejsza liczba to: " + min);

        for (Integer i : integerSet) {
            sum += i;
        }
        average = sum / integerSet.size();
        System.out.println("Srednia to: " + average);

        System.out.println("Wszystkie liczby powyżej średniej: ");
        for (Integer i : integerSet) {
            if (i > average) {
                System.out.print(i + ", ");
            }
        }
    }
}