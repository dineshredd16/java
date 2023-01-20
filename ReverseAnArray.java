import java.util.*;

public class ReverseAnArray {
  public static void main(String[] args){
    Scanner readUser = new Scanner(System.in);
    System.out.println("enter the number of test cases: ");
    int t = readUser.nextInt();
    for(int z=0; z<t; z++){
      System.out.println("enter the size of array: ");
      int n = readUser.nextInt();
      System.out.println("enter the position to shift array: ");
      int m = readUser.nextInt();
      int eachArray[] = new int[n];
      int p = n - 1;
      for (int y=0; y<n; y++){
        System.out.println("enter the element: ");
        if (y <= m){
          eachArray[y] = readUser.nextInt();
        }
        else {
          eachArray[p] = readUser.nextInt();
          p--;
        }
      }
      for(int y=0; y<n; y++){
        System.out.print(eachArray[y] + " ");
      }
      System.out.println(" ");
    }
    readUser.close();
  }
}