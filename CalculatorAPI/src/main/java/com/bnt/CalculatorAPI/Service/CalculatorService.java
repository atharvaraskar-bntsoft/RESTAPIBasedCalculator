package com.bnt.CalculatorAPI.Service;

import com.bnt.CalculatorAPI.Response.SuccessResponseArray;

public interface CalculatorService {
      
    double calculatorAddition(double number1,double number2);
    double calculatorSubstraction(double number1,double number2);
    double calculatorMultiplication(double number1,double number2);
    double calculatorDivision(double number1,double number2);
    double calculatorSquare(double number1);
    double calculatorSquareroot(double number1);
    double calculatorFactorial(double number1);
    SuccessResponseArray calculatorMinMaxArray(int[] numbers) ;

}