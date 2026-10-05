import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {-5, 5, -2, 3, -2, 4};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(Math.abs(x));
        }

        System.out.println("Number of distinct absolute values: " + set.size());
    }
}
