import java.util.Iterator;
import java.util.Set;

public class ValuesAboveAverage {
    public static void valuesAboveAverage(Set set, double avarage) {

        Iterator<Integer> integerIterator = set.iterator();
        while (integerIterator.hasNext()) {
            int temp = integerIterator.next();
            if (temp > avarage) {
                System.out.print(temp + " ");
            }
        }
    }
}