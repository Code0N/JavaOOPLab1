package dnr.K7Tesserakt;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("\nПервое задание");
        for (String i : args) {
            System.out.print(i + " ");
        }
        System.out.println("\nВторое задание");
        for (int i = 1; i < 501; ++i) {
            if (i % 5 == 0) {
                System.out.println("fizz");
            } else if (i % 7 == 0) {
                System.out.println("buzz");
            } else if ((i % 5 == 0) && (i % 7 == 0)) {
                System.out.println("fizzbuzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("\nТретье задание");
        for (int i = args.length - 1; i >= 0; --i) {
            System.out.print(new StringBuffer(args[i]).reverse().toString() + " ");
        }
        System.out.println("\nЧетвёртое задание");
        int ind = 0;
        int sfib = 1;
        int fi = 1;
        int si = 1;
        while (ind++ < 10) {
            System.out.print(sfib + " ");
            sfib = fi + si;
            fi = si;
            si = sfib;
        }
        System.out.println("\nПятое задание");
        int formult = 1;
        System.out.println(formult + " ");
        for(int i = 2; i < 11; ++i){
           formult = formult * i;
            System.out.print(formult + " ");
        }
        System.out.println("\nШестое задание");
        boolean[] primes;
        primes = new boolean[11];
        Arrays.fill(primes, true);
        primes[0] = false; primes[1] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i]) {
                for (int j = 2; i * j < primes.length; ++j) {
                    primes[i * j] = false;
                }
            }
        }
        for (int i = 0; i < 11; ++i) {
            System.out.print(i + ":" + primes[i] + " ");
        }
    }
}
