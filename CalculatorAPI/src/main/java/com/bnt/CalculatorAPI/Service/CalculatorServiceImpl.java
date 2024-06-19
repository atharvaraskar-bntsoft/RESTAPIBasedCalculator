package com.bnt.CalculatorAPI.Service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int calculatorAddition(int number1, int number2) {
        int result=number1+number2;
        return result;
    }

    @Override
    public int calculatorSubstraction(int number1, int number2) {
        int result=number1-number2;
        return result;
      
    }

    @Override
    public int calculatorMultiplication(int number1, int number2) {
        int result=number1*number2;
         return result;
       
    }

    @Override
    public int calculatorDivision(int number1, int number2) {
        int result=number1/number2;
         return result;
    }

    @Override
    public int calculatorSquare(int number1) {
        int result=number1*number1;
         return result;       
    }

    @Override
    public int calculatorSquareroot(int number1) {
        int  result=(int)Math.sqrt(number1);
        return result;       
     
    }

    @Override
    public int calculatorFactorial(int number1) {
        int i,fact=1;     
        for(i=1;i<=number1;i++){    
                fact=fact*i;    
             }    
             return fact;     
       
    }


    
}
