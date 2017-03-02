package exercises.problem4;

import java.sql.Time;

/**
 * Created by edmondzhupani on 26/02/2017.
 */
public class Solver {
    public void Solve(){
        int max = Integer.MIN_VALUE;
        for (int i = 999; i >= 100 ; i--) {
            for (int j = 999; j >= i ; j--) {
                if(new Palindrome(String.valueOf(i*j)).isPalindrome())
                {
                    if (i*j > max)
                    {
                        max = i*j;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
