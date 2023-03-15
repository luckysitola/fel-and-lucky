public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        int sqrtN = (int) Math.sqrt(num);
        for (int y = 2; y <= sqrtN; y++) {
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
