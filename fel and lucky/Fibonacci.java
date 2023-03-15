public class Fibonacci {
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
       int g = 1, k = 2, z = 0;
        while (k <= limit) {
            if (k % 2 == 0) {
                sum += k;
            }
            z = g + k;
            g = k;
            k = z;
        }
        return sum;
    }

    public static void main(String[] args) {
        int limit = 4000000;
        int sum = sumEvenFibonacci(limit);
        System.out.println("The sum of even-valued terms in the Fibonacci sequence whose values do not exceed " + limit + " is " + sum);
    }
}
