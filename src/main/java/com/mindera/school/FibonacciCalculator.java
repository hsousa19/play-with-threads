package com.mindera.school;

import com.sun.source.tree.WhileLoopTree;

import java.util.List;

/**
 * Used to calculate the Fibonacci sequence
 *
 * https://en.wikipedia.org/wiki/Fibonacci_number
 */
public class FibonacciCalculator {

    /**
     * Calculates n entries of the fibonacci sequence
     * <p>
     * In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence,
     * such that each number is the sum of the two preceding ones, starting from 0 and 1
     * <p>
     * eg: 0,1,1,2,3,5,8,13,21,34,55,89,144
     */
    public String fibonacciSequence(final Integer n) {
            int nr1= 0;
            int nr2 = 1;
            int soma;
            String seq = nr1 + "," + nr2;
            for (int i = 0; i < n; i++){
                 soma = nr1 + nr2;
                nr1 = nr2;
                nr2 = soma;
                seq += "," + soma;
            }
            return seq;
    }







    public List<String> sequences(List<Integer> entries) {
        // TODO you should use threads for this
        return List.of("");
    }
}
