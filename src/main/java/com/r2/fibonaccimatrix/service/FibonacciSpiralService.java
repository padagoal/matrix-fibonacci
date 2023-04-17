package com.r2.fibonaccimatrix.service;

import java.util.ArrayList;
import java.util.List;


public class FibonacciSpiralService {

    private int[][] matrix;

    public FibonacciSpiralService(int sizeRow, int sizeCol) {
        matrix = new int[sizeRow][sizeCol];
        generateFibonacciSpiral();
    }

    public int[][] getMatrix() {
        return matrix;
    }

    private void generateFibonacciSpiral() {
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;
        int numElements = matrix.length * matrix[0].length;
        List<Integer> fibonacciSequence = generateFibonacciSequence(numElements);

        int k = 0;
        while (k < numElements) {
            // Fill the first row
            for (int i = colStart; i <= colEnd && k < numElements; i++) {
                matrix[rowStart][i] = fibonacciSequence.get(k++);
            }
            rowStart++;

            // Fill the last column
            for (int i = rowStart; i <= rowEnd && k < numElements; i++) {
                matrix[i][colEnd] = fibonacciSequence.get(k++);
            }
            colEnd--;

            // Fill the last row
            for (int i = colEnd; i >= colStart && k < numElements; i--) {
                matrix[rowEnd][i] = fibonacciSequence.get(k++);
            }
            rowEnd--;

            // Fill the first column
            for (int i = rowEnd; i >= rowStart && k < numElements; i--) {
                matrix[i][colStart] = fibonacciSequence.get(k++);
            }
            colStart++;
        }
    }


    private List<Integer> generateFibonacciSequence(int numElements) {
        List<Integer> sequence = new ArrayList<>();
        sequence.add(0);
        sequence.add(1);

        for (int i = 2; i < numElements; i++) {
            sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
        }

        return sequence;
    }


}
