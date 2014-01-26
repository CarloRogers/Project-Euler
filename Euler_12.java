/**
 * Auto Generated Java Class.
 */
public class Euler_12 {
  
  
  public static void main(String[] args) { 
    long result = 0;
    long i = 0;
    while(result < 501){
    result = divisors(nThTriangleNumber(i));
    if(result > 500){
    System.out.println(nThTriangleNumber(i));
    }
    i++;
    }
  }
  
  public static long nThTriangleNumber(long x){
  long sum = 0;
  for(long i = 1; i <= x; i++){
    sum = sum + i;
  }
  return sum;
  
}

public static long divisors(long x){
  long divisors = 0;
  for(long i = 1; i <=x; i++){
    if(x%i == 0){
      divisors++;
    }
  }
  
  return divisors;
}
}