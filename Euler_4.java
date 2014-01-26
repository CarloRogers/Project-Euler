/**

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

 */
public class Euler_4 {
  
  public static void main(String[] args) { 
    int y = 0;
    palindromeProduct();
  }
  public static int palindromeProduct() { 
    int product = 0;
    String palindromeTest;
    String temp = "";
    int biggest = 0;
    for(int q = 100; q < 1000; q++){
      for(int w = 100; w < 1000; w++){
      product = q * w;
      if(product > biggest){
      palindromeTest = Integer.toString(product);
      temp = "";
      for(int i = (palindromeTest.length()-1); i >= 0; i--){
        temp = temp + palindromeTest.charAt(i);
      }
      if(temp.equals(palindromeTest)){
      biggest =Integer.parseInt(temp);
      }
      }
      }
    }
    System.out.println(biggest);
    return biggest;
  }
  
}
