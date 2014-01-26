import java.math.BigInteger;

public class Euler_20 {
  
  
  public static void main(String[] args) {
    BigInteger u = new BigInteger("100");
    System.out.println(factorialSum1(u));
    String result = (factorialSum1(u)).toString();
      int temp = 0;
      for(int i = 0; i < result.length(); i++){
    temp = temp + Integer.parseInt(result.substring(i, i+1));
    }
      System.out.println(temp);
  }
  
  public static long factorialSum(long x){
    long temp = 1;
    while(x > 1){
    temp = temp + temp * (x - 1);
    x--;
    }
    return temp;
  }
  
    public static BigInteger factorialSum1(BigInteger x){
    BigInteger temp = new BigInteger("1");
    BigInteger one = new BigInteger("1");
    while(x.compareTo(one) != 0){
    temp = temp.add((temp.multiply(x.subtract(one))));
    x = x.subtract(one);
    
    System.out.println(x);
    }
    return temp;
  }
  
}
