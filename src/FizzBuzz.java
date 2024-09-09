/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {doFizzBuzz(i);}
        int ii = 1;
        while (ii <= 100) {
            // Find out which numbers divide i.
            boolean divisibleBy3_while = ii % 3 == 0;
            boolean divisibleBy5_while = ii % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3_while && divisibleBy5_while) {

                System.out.println("Fizz Buzz while");

            } else if (divisibleBy3_while) {

                System.out.println("Fizz while");

            } else if (divisibleBy5_while) {

                System.out.println("Buzz while");

            } else {

                System.out.println(ii);
            }
            ii += 1;
        }
    }

    public static void doFizzBuzz(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
    }
}