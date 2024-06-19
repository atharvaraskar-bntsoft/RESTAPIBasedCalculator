package com.bnt.CalculatorAPI.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.CalculatorAPI.Response.SuccessResponse;
import com.bnt.CalculatorAPI.Service.CalculatorService;

@RestController
@RequestMapping("calculatorapi/v1")
public class CalculatorController {

       @Autowired
       CalculatorService calculatorService;

       @GetMapping("/addition")
       ResponseEntity<Object> Addition(@RequestParam int number1, @RequestParam int number2){
            int result=calculatorService.calculatorAddition(number1, number2);
           String detail= number1+"+"+number2+"="+result;
            SuccessResponse successResponse=new SuccessResponse(result,detail);
            return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
       }

       
         @GetMapping("/subtraction")
          ResponseEntity<Object> Substraction(@RequestParam int number1, @RequestParam int number2){
            int result=calculatorService.calculatorSubstraction(number1, number2);
            String detail= number1+"-"+number2+"="+result;
            SuccessResponse successResponse=new SuccessResponse(result,detail);
            return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
       }

       @GetMapping("/multiplication")
       ResponseEntity<Object> Multiplication(@RequestParam int number1, @RequestParam int number2){
         int result=calculatorService.calculatorMultiplication(number1, number2);
         String detail= number1+"*"+number2+"="+result;
         SuccessResponse successResponse=new SuccessResponse(result,detail);
         return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
    }


    @GetMapping("/division")
       ResponseEntity<Object> Division(@RequestParam int number1, @RequestParam int number2){
         int result=calculatorService.calculatorDivision(number1, number2);
         String detail= number1+"/"+number2+"="+result;
         SuccessResponse successResponse=new SuccessResponse(result,detail);
         return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
    }

    @GetMapping("/square/{number1}")
    ResponseEntity<Object> Square(@PathVariable int number1){
      int result=calculatorService.calculatorSquare(number1);
      String detail= "Square of "+number1+"="+result;
      SuccessResponse successResponse=new SuccessResponse(result,detail);
      return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
     }

     
    @GetMapping("/squareroot/{number1}")
    ResponseEntity<Object> Squareroot(@PathVariable int number1){
      int result=calculatorService.calculatorSquareroot(number1);
      String detail= "Squareroot of "+number1+"="+result;
      SuccessResponse successResponse=new SuccessResponse(result,detail);
      return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
     }

     @GetMapping("/factorial/{number1}")
     ResponseEntity<Object> Factorial(@PathVariable int number1){
       int result=calculatorService.calculatorFactorial(number1);
       String detail= number1+"!"+"="+result;
       SuccessResponse successResponse=new SuccessResponse(result,detail);
       return new ResponseEntity<Object>(successResponse,HttpStatus.OK);
      }

      @GetMapping("/min-max")
      int ArrayMinMax(@RequestParam int numbers[]){
                   return numbers[0];
       }
 

     

        
  

    
}
