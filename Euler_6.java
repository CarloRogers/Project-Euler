/**
The sum of the squares of the first ten natural numbers is,
12 + 22 + ... + 102 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 ? 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Euler_6 {
  
  
  public static void main(String[] args) { 
    sumSquareDifference(100);
  }
  
  public static int sumSquareDifference(int x){
    int sumSquares = 0;
    int squareSum = 0;
    for(int i = 1; i <= x; i++){
    sumSquares = sumSquares + i*i;
    }
    for(int j = 1; j <= x; j++){
      squareSum = squareSum + j;
    }
    squareSum = squareSum * squareSum;
    
    System.out.println(squareSum - sumSquares);
    return squareSum - sumSquares;
    
    
  }
  /* ADD YOUR CODE HERE */
  
}
