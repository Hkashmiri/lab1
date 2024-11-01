package edu.desu.datastructs.partA;

public class ScientificCalculator {

    // This method should add two numbers: x and y, and return the result.
    public double add(double x, double y){
        // TODO: Implement the addition operation.
        return x+y;
    }

    // This method should subtract y from x and return the result.
    public double subtract(double x, double y){
        // TODO: Implement the subtraction operation.
        return x-y;
    }

    // This method should multiply x by y and return the result.
    public double multiply(double x, double y){
        // TODO: Implement the multiplication operation.
        return x*y;
    }

    // This method should divide x by y and return the result.
    // Remember to handle the case when y is zero to avoid division by zero.
    public double divide(double x, double y){
        // TODO: Implement the division operation.
        // TODO: Handle the divide by zero scenario.
        if (y==0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return x/y;
    }

    // This method should return the sine of x.
    public double sin(double x){
        // TODO: Implement the sine function using Java's Math library or another method.
        return Math.sin(x);
    }

    // This method should return the cosine of x.
    public double cos(double x){
        // TODO: Implement the cosine function using Java's Math library or another method.
        return Math.cos(x);
    }

    // This method should return the tangent of x.
    public double tan(double x){
        // TODO: Implement the tangent function using Java's Math library or another method.
        return Math.tan(x);
    }

    // This method should raise x to the power of e and return the result.
    public double exponent(double x, double e){
        // TODO: Implement the exponentiation operation.
        return Math.pow(x, e);
    }

    // This method should return the natural logarithm (base e) of x.
    // Remember to handle cases where x is negative or zero.
    public double logarithm(double x){
        // TODO: Implement the natural logarithm function.
        // TODO: Handle cases where x is less than or equal to zero.
        if (x<=0) {
            throw new ArithmeticException("Logarithm of zero or negative numbers is undefined.");
        }
        return Math.log(x);
    }
}
