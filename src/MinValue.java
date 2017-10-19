import java.util.Iterator;
import java.util.Set;

public class MinValue {
    public static int minValue(Set set, int max) {

        Iterator<Integer> integerIterator = set.iterator();

        int min = max;
        while (integerIterator.hasNext()) {
            int temp = integerIterator.next();
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}