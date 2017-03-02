package exercises.problem7;

/**
 * Created by edmondzhupani on 01/03/2017.
 */

public class Solver {
    public void solve() {
        double lowerBound = (Math.log10(10001) + Math.log10(Math.log10(10001)) - 1) * 10001;
        double upperBound = (Math.log10(10001) + Math.log10(Math.log10(10001))) * 10001;

        for (int i = (int)lowerBound; i <= upperBound; i++)
        {
            boolean isPrime = true;
            int numberGreaterThanSqrt = (int)Math.ceil(Math.sqrt(i));
            if (i % 2 == 0)
            {
                isPrime = false;
                continue;
            }
            for (int k = 3; k <= numberGreaterThanSqrt; k = k + 2)
            {
                if (i%k == 0)
                {
                    isPrime = false;
                    continue;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }

            //test
        }
    }
}
