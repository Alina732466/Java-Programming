/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

class CustomException extends Exception{
    public CustomException(String message){
        super(message);
    }
}
class ExceptionDemo{
    public void performTask(int value) throws CustomException {
        if (value < 0){
            throw new CustomException("Value cannot be negative");
        }else if(value>100){
            throw new CustomException("Value cannot exceed 100");
        }else{
            System.out.println("Task performed successfully");
            
        }
        
    }
}
public class JavaApplication6 {
    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.performTask(50); 
            demo.performTask(-10); 
            demo.performTask(120); 
        } catch (CustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
}
}
}
    

