package com.r2.fibonaccimatrix;

import com.r2.fibonaccimatrix.annotation.ApiLog;
import com.r2.fibonaccimatrix.service.FibonacciSpiralService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class FibonacciAPI {

    @ApiLog
    @GetMapping("/spiral")
    public int[][] fibonacciMatrix(@RequestParam(value = "row", defaultValue = "5") Integer row,
                                @RequestParam(value = "col", defaultValue = "5") Integer col){


        FibonacciSpiralService fibonacciSpiralService = new FibonacciSpiralService(row, col);

        int[][] matrix = fibonacciSpiralService.getMatrix();

        for (int[] rowPrint : matrix) {
            System.out.println(Arrays.toString(rowPrint));
        }

        return matrix;
    }
}
