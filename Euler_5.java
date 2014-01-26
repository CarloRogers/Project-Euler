/**
 
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */
public class Euler_5 {

  public static void main(String[] args) { 
    smallest();
  }
  
  public static int smallest(){
  int x = 20;
  int i = 1;
  boolean divisible = false;
  while(divisible == false){
    i = 1;
    while(x % i == 0 && i < 21){
     i++;
      if(i == 20){
        System.out.println(x);
        return x;
      }
    }
  x = x + 20;
  }
  System.out.println(x);
  return x;
  }
}