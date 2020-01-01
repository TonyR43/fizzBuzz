package com.company;


/* Various solutions to the game fizzbuzz.

 */

public class Main {

    public static void main(String[] args)
    {
        /* Standard Solution
         */
        System.out.println("Standard Solution");
        for (int i = 1; i <= 100; i++)
        {
            if (i % 15 == 0)
            {
                System.out.println("fizzBuzz");
            }

            else if  (i % 3 ==0)
            {
                System.out.println("fizz");
            }

            else if (i % 5 == 0)
            {
                System.out.println("buzz");
            }

            else
            {
                System.out.println(i);
            }
        }

	/* Short Solution
	       Does the same thing in less code, however not as readable
	 */
        System.out.println("\n Short but messy solution");
        for(int i=1;i<=100; i++)
            System.out.println((i % 3 > 0 ? "" : "Fizz") + (i % 5 > 0 ? i % 3 > 0 ? i : "" : "Buzz"));
    }
}
