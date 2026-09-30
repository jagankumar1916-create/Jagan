class SecondLargest {
    public static void main(String[] args) {
        int[] a = {10, 50, 20, 80, 30};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }

        System.out.println("Second largest = " + second);
    }
}
