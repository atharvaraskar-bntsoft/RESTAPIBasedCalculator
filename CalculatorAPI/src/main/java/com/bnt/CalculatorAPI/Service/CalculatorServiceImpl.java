package com.bnt.CalculatorAPI.Service;

import org.springframework.stereotype.Service;
<<<<<<< HEAD
import com.bnt.CalculatorAPI.Response.SuccessResponseArray;
=======
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
<<<<<<< HEAD
    public double calculatorAddition(double number1, double number2) {
        double result=number1+number2;
=======
    public int calculatorAddition(int number1, int number2) {
        int result=number1+number2;
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e
        return result;
    }

    @Override
<<<<<<< HEAD
    public double calculatorSubstraction(double number1, double number2) {
        double result=number1-number2;
=======
    public int calculatorSubstraction(int number1, int number2) {
        int result=number1-number2;
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e
        return result;
      
    }

    @Override
<<<<<<< HEAD
    public double calculatorMultiplication(double number1, double number2) {
        double result=number1*number2;
=======
    public int calculatorMultiplication(int number1, int number2) {
        int result=number1*number2;
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e
         return result;
       
    }

    @Override
<<<<<<< HEAD
    public double calculatorDivision(double number1, double number2) {
         double result=number1/number2;
=======
    public int calculatorDivision(int number1, int number2) {
        int result=number1/number2;
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e
         return result;
    }

    @Override
<<<<<<< HEAD
    public double calculatorSquare(double number1) {
        double result=number1*number1;
=======
    public int calculatorSquare(int number1) {
        int result=number1*number1;
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e
         return result;       
    }

    @Override
<<<<<<< HEAD
    public double calculatorSquareroot(double number1) {
        double  result=Math.sqrt(number1);
=======
    public int calculatorSquareroot(int number1) {
        int  result=(int)Math.sqrt(number1);
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e
        return result;       
     
    }

    @Override
<<<<<<< HEAD
    public double calculatorFactorial(double number1) {
        double i,fact=1;     
=======
    public int calculatorFactorial(int number1) {
        int i,fact=1;     
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e
        for(i=1;i<=number1;i++){    
                fact=fact*i;    
             }    
             return fact;     
       
    }

<<<<<<< HEAD
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

=======
>>>>>>> b7d277dd4f749449190bdfd4cb7924aef94d507e

    
}
