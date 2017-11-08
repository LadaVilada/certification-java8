package algorithms;

import algorithms.impl.FactorialAlgorithm;

public class AlgorithmRunner {

    private static FactorialAlgorithm factorialAlgorithm = new FactorialAlgorithm();

    public static void main(String[] args) {
        System.out.println("5! = " + factorialAlgorithm.simple(5));
        System.out.println("1! = " + factorialAlgorithm.simple(1));
        System.out.println("10! = " + factorialAlgorithm.simple(10));
    }
}
