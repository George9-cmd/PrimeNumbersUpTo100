public class PrimeNumbersUpTo500 {

    public static void main(String[] args) {
        int limit = 500;
        int count = 0;

        System.out.println("Prime numbers between 0 and " + limit + ":");

        for (int number = 0; number <= limit; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
        }

        System.out.println("\n\nTotal prime numbers found: " + count);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        // Only check odd divisors up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}