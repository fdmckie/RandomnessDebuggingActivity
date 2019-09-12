
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        /*import java.util.random;

        public class RandomGenerator{
            public static void main(String[] args)
            {
                output("Generate 10 random integers between 0 and 6");
                Random rnd;

                for (int i = 1; i <= 12; ++i)
                {
                    int randomInt = 1 + rnd.nextInt(0 to 6);
                    output("Generated number: " + randomInt);
                }

                output("Done.");
            }

            private static void output(String aMessage)
            {
                System.out.println(aMessage);
            }
        }*/


        Random r = new Random();

//        int number = 1 + r.nextInt(10);

        for (int i = 1; i <= 10; i++)
        {
            int randomInt = 1 + r.nextInt(6);
            System.out.println("Generated number: " + randomInt);
        }





    }

}
