/**
 * Auto Generated Java Class.
 */
public class Euler_1 {
  
  
  public static void main(String[] args) { 
    System.out.println(divisible(1000));
  }
  public static int divisible(int a){
  int sum = 0; 
  for(int i = 0; i < a; i++){
    if((i%3 == 0) || (i%5 == 0)){
      sum = sum + i;
    }
  }
  return sum;
  /* ADD YOUR CODE HERE */
  
}
}