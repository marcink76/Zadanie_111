import java.util.Iterator;
import java.util.Set;

public class MaxValue {
    public static int maxValue(Set set) {

        Iterator<Integer> setIterator = set.iterator();
        int max = 0;
        while (setIterator.hasNext()) {
            int temp = setIterator.next();
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}