package algorithms.impl;

/**
 * The type Factorial algorithm.
 */
public class FactorialAlgorithm {

    /**
     * Instantiates a new Factorial algorithm.
     */
    public FactorialAlgorithm() {
    }

    /**
     * Native implementation.
     * <p>
     * N! = N * (N-1)!
     *
     * @param n the n
     * @return int = n!
     */
    public int simple(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
