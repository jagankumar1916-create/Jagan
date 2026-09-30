class ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            System.out.println(a / b);   // Arithmetic Exception
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
