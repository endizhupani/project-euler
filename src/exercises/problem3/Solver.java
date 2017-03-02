package exercises.problem3;

import java.math.BigInteger;

/**
 * Created by edmondzhupani on 26/02/2017.
 */
public class Solver {
    public void Solve(){
        long divisionResult = 3;
        long i = 600851475143L;
        long lastFactor;
        if (i%2 == 0) {
            lastFactor = 2;
            i = i / 2;
            while (i % 2 == 0)
            {
                i = i / 2;
            }
        }
        else
        {
            lastFactor = 1;
        }
        long factor = 3;
        double maxFactor = Math.sqrt(i);
        while(i > 1 && factor <= maxFactor)
        {
            if (i % factor == 0)
            {

                i = i / factor;
                lastFactor = factor;
                while(i % factor == 0)
                {
                    i = i/factor;
                }
                maxFactor = Math.sqrt(i);
            }
            factor += 2;
        }
        if (i == 1){
            System.out.println(lastFactor);
        }
        else
        {
            System.out.println(i);
        }
//        while (i >=1)
//        {
//            long prevI = i;
//            System.out.println("i: " + i);
//            System.out.println("Expected division result: " + divisionResult);
//            if (600851475143L % i == 0)
//            {
//                System.out.println("Testing: " + i);
//                boolean conditionsMet = new AKS(new BigInteger(String.valueOf(i))).isPrime();
//
//                if (conditionsMet) {
//                    System.out.println("Result: " + i);
//                    return;
//                }
//
//                i = 600851475143L / divisionResult;
//                if (i >= prevI)
//                {
//                    i = prevI - 1;
//                }
//                divisionResult ++;
//            }
//            else{
//
//                i = 600851475143L / divisionResult;
//                System.out.println("prevI: " + prevI + " i: " + i);
//                if (i >= prevI)
//                {
//                    i = prevI - 1;
//                }
//                divisionResult ++;
//            }
//
//
//        }
    }
}
