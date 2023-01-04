// Lab11avst.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.


import java.util.Scanner;


public class Lab11avst
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        boolean primes[];
        primes = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[]) {
        System.out.println("\nCOMPUTING PRIME NUMBERS");

        for (int key = 1; key < primes.length; key++){
            primes[key] = true;
        }

        for(int value = 2; value < primes.length; value++){
            for(int factors = (2 * value); factors < primes.length; factors += value) {
                primes[factors] = false;
                }
            }
        }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();

        for (int key = 1; key < primes.length; key++) {
            if (primes[key] == true)
                System.out.print(key + " ");
        }

    }

}



