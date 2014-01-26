import java.math.BigInteger;

public class Euler_16 {
  
  
  public static void main(String[] args) { 
    BigInteger big = new BigInteger("2");
    BigInteger power = new BigInteger("1000");
    String bigShit;
    BigInteger shit = new BigInteger("0");
    
    shit = big.pow(1000);
    bigShit = shit.toString();
    int sum = 0;
    for(int i = 0; i < bigShit.length(); i++){
      sum = sum + Integer.parseInt(bigShit.substring(i, i+1));
    }
    System.out.println(sum);
  }
  
  /* ADD YOUR CODE HERE */
  
}
