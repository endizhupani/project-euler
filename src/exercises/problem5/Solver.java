package exercises.problem5;

/**
 * Created by edmondzhupani on 27/02/2017.
 */
public class Solver {
    public void Solve(){
        int[][] factors = new int[21][8];
        int[] primeNumbers = {2,3,5,7,11,13,17,19};
        int[] maxOccurances = new int[8];
        for (int i = 1; i <= 20; i++) {
            for (int j = 0; j < 8; j++) {
                factors[i][j] = 0;
            }

        }
        for (int i = 1; i <= 20 ; i++) {
            int number = i;
            for (int j = 7; j >= 0; j--){
                    while(number%primeNumbers[j] == 0) {
                        factors[i][j]++;
                        number = number / primeNumbers[j];
                    }
            }
        }
        int value = 1;
        for (int i = 0; i < primeNumbers.length; i++) {
            int max = 0;
            for(int j = 1; j < 21; j++)
            {
                if (factors[j][i] > max)
                {
                    max = factors[j][i];
                }
            }
            maxOccurances[i] = max;

        }
        for (int i = 0; i < 8; i++) {
            System.out.println("Currence: " + maxOccurances[i]);
            value *= Math.pow(primeNumbers[i], maxOccurances[i]);
        }
        System.out.println(value);


    }
}
