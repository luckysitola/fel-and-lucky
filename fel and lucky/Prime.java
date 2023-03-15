package quiz.pkg2;

public class Prime {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int y = 2; y <= Math.sqrt(num); y++) {
            if (num % y == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int y = 1; y <= 500; y++) {
            if (isPrime(y)) {
                System.out.print(y + " ");
            }
        }
    }
}
