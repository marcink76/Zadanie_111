import java.util.Iterator;
import java.util.Set;

class AverageCalculator {
    public static double average(Set set) {
        int sum = 0;

        Iterator<Integer> setIterator = set.iterator();

        while (setIterator.hasNext()) {
            int temp = setIterator.next();
            sum += temp;
        }
        return (double) sum / set.size();
    }
}