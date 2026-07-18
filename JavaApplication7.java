package javaapplication7;

class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}

class OnlineShopping {
    public void placeOrder(int quantity) throws InvalidOrderException {

        if (quantity <= 0) {
            throw new InvalidOrderException("Order quantity must be greater than zero.");
        } else if (quantity > 10) {
            throw new InvalidOrderException("You cannot order more than 10 items.");
        } else {
            System.out.println("Order placed successfully.");
        }
    }
}


public class JavaApplication7 {
    public static void main(String[] args) {

        OnlineShopping shop = new OnlineShopping();

        try {
            shop.placeOrder(5);    
            shop.placeOrder(0);    
            shop.placeOrder(15);   
        } catch (InvalidOrderException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
