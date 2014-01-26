/**


A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */
public class Euler_9 {
  
  
  public static void main(String[] args) { 
    triplet();
  }
  
  public static void triplet(){
  int sum = 1000;
  
  for(int i = 0; i < 300; i++){
    for(int j = 0; j < 400; j++){
      for(int k = 0; k < 500; k++){
        if(i + j + k > 1000){
        continue;
        }
        if(i * i + j * j == k * k && (i + j + k) == sum){
        System.out.println(i + " " +  j + " " + k);
        System.out.println(i*j*k);
        break;
        }
    
  }
  
    }
  }
  }
}

