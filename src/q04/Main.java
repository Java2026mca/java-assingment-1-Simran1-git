import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // TODO: Read n integers. For each number print:
        //   "Prime"     if it is prime
        //   "Perfect"   if it is a perfect number (sum of proper divisors == itself, e.g. 6=1+2+3)
        //   "Both"      if it is both (there are none < 100, but handle it)
        //   "Neither"   otherwise
        //
        // Input:
        // 4
        // 6 13 8 28
        //
        // Output:
        // Perfect
        // Prime
        // Neither
        // Perfect
         if (!sc.hasNextInt()) return;
         for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                System.out.println(classify(num));
            }
        }
        sc.close();
    

    public static String classify(int num) {
        boolean prime = isPrime(num);
        boolean perfect = isPerfect(num);

        if (prime && perfect) return "Both";
        if (prime) return "Prime";
        if (perfect) return "Perfect";
        return "Neither";
    

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    

    public static boolean isPerfect(int n) {
        if (n < 2) return false;
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) {
                    sum += n / i;
                }
    }
}
    }
}
}
