package com.r2.fibonaccimatrix;

import com.r2.fibonaccimatrix.annotation.ApiLog;
import com.r2.fibonaccimatrix.service.FibonacciSpiralService;
import com.r2.fibonaccimatrix.service.fibonacciResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class FibonacciAPI {

    @ApiLog
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/spiral")
    public fibonacciResponse fibonacciMatrix(@RequestParam(value = "row", defaultValue = "5") Integer row,
                                             @RequestParam(value = "col", defaultValue = "5") Integer col){

        if(row<=0 || col<=0 ){
            return null;
        }
        FibonacciSpiralService fibonacciSpiralService = new FibonacciSpiralService(row, col);

        int[][] matrix = fibonacciSpiralService.getMatrix();

        for (int[] rowPrint : matrix) {
            System.out.println(Arrays.toString(rowPrint));
        }
        fibonacciResponse response = new fibonacciResponse();
        response.setMatrix(matrix);
        return response;
    }
}
