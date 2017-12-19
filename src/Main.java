import java.util.*;


public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        random.nextInt(1000);

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 50; i++) {
            treeSet.add(random.nextInt(1000));
        }
        System.out.println("Najmniejsza wartość: " + treeSet.first());
        System.out.println("Największa wartość: " + treeSet.last());
        int sum = 0;
        for (Integer ints : treeSet) {
            sum = sum + ints;
        }
        int avg = sum/treeSet.size();
        System.out.println("Suma = " + sum);
        System.out.println("Średnia = " + avg);

        for (Integer ints: treeSet) {
            if (ints > avg){
                System.out.print(ints + "; ");
            }
        }
    }
}
