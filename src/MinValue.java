import java.util.Iterator;
import java.util.Set;

public class MinValue {
    public static int minValue(Set set) {

        Iterator<Integer> integerIterator = set.iterator();

        int min = MaxValue.maxValue(set);
        while (integerIterator.hasNext()) {
            int temp = integerIterator.next();
            if (temp < min) {
                min = temp;
            }
        }
        return min;
    }
}