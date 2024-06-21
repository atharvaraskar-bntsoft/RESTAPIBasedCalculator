package com.bnt.CalculatorAPI.Service;

import org.springframework.stereotype.Service;
import com.bnt.CalculatorAPI.Response.SuccessResponseArray;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public double calculatorAddition(double number1, double number2) {
        double result=number1+number2;
    public int calculatorAddition(int number1, int number2) {
        int result=number1+number2;
        return result;
    }

    @Override
    public double calculatorSubstraction(double number1, double number2) {
        double result=number1-number2;

    public int calculatorSubstraction(int number1, int number2) {
        int result=number1-number2;
        return result;
      
    }

    @Override
    public double calculatorMultiplication(double number1, double number2) {
        double result=number1*number2;
    public int calculatorMultiplication(int number1, int number2) {
        int result=number1*number2;
         return result;
       
    }

    @Override
    public double calculatorDivision(double number1, double number2) {
         double result=number1/number2;
    public int calculatorDivision(int number1, int number2) {
        int result=number1/number2;
         return result;
    }

    @Override
    public double calculatorSquare(double number1) {
        double result=number1*number1;
    public int calculatorSquare(int number1) {
        int result=number1*number1;
         return result;       
    }

    @Override
    public double calculatorSquareroot(double number1) {
        double  result=Math.sqrt(number1);
    public int calculatorSquareroot(int number1) {
        int  result=(int)Math.sqrt(number1);
        return result;       
     
    }

    @Override
    public double calculatorFactorial(double number1) {
        double i,fact=1;         
        for(i=1;i<=number1;i++){    
                fact=fact*i;    
             }    
             return fact;     
       
    }


    @Override
    public SuccessResponseArray calculatorMinMaxArray(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        SuccessResponseArray obj= new SuccessResponseArray();
        obj.setMin(min);
        obj.setMax(max);
        return obj;
    }

    
}
