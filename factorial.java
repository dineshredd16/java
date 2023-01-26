import java.math.BigInteger;
import java.util.*;
public class factorial {
  public static void main(String[] args){
    Scanner readUser = new Scanner(System.in);
    System.out.print("enter the number to calculate factorial: ");
    BigInteger result;
    result = BigInteger.valueOf(1);
    int t = readUser.nextInt();
    for(int i=1; i<=t; i++){
      result = result.multiply(BigInteger.valueOf(i));
    }
    System.out.println("The factorial of " + t + " is " + result);
    readUser.close();
  }
}
