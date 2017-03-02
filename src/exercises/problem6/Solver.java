package exercises.problem6;

/**
 * Created by edmondzhupani on 01/03/2017.
 */
public class Solver {

    public void solve(){
        System.out.println("Result: " + (this.squareOfSum(100) - this.sumOfSquares(100)));
    }

    /**
     * Computes the sum of squares of the first n natural numbers
     * @param n
     * @return
     */
    public int sumOfSquares(int n){
        return (n*(n+1)*(2*n+1))/6;
    }

    public int squareOfSum(int n) {
        return (int)Math.pow((n*(n+1))/2,2);
    }
}
