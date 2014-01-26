
/* The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 
*/

import java.math.BigInteger;
public class Euler_3 {
  
  
  public static void main(String[] args) { 
    BigInteger testi = new BigInteger("600851475143");
    System.out.println(primeFactors(testi));
  }
  
  public static BigInteger primeFactors(BigInteger shit){
  int count = 0;
  BigInteger i = new BigInteger("1");
  BigInteger k = new BigInteger("2");
  BigInteger h = new BigInteger("1");
  BigInteger j = new BigInteger("0");
  BigInteger temp = new BigInteger("0");
    for(i = k; shit.compareTo(i) > 0;){
      temp = shit.remainder(i);
      if(temp.equals(j) && onkoAlkuluku(i)){
      System.out.println(i);
      }
      i = i.add(new BigInteger("1"));
    }
    return i;
  }
  
  
  
  public static boolean onkoAlkuluku(BigInteger luku){
    boolean alkuluku = true; //Alustetaan boolean alkuluku todeksi
    BigInteger i = new BigInteger("1");
    BigInteger k = new BigInteger("2");
    BigInteger h = new BigInteger("1");
    BigInteger j = new BigInteger("0");
    BigInteger temp = new BigInteger("10");
    for(i = k; luku.compareTo(i) > 0;){
      temp = luku.remainder(i);
      if(temp.equals(j)){
        alkuluku = false;
    }
      i = i.add(new BigInteger("1"));
    }
        return alkuluku;
    }
}

