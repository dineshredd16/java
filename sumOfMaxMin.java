import java.util.*;

public class sumOfMaxMin {
  public static void main(String[] args){
    Scanner readUser = new Scanner(System.in);
    System.out.print("enter the number of test cases: ");
    int t = readUser.nextInt();
    for (int z=0; z<t; z++){
      System.out.print("enter the size of array: ");
      int n = readUser.nextInt();
      int array[] = new int[n];
      for(int y=0; y<n; y++){
        System.out.print("enter the element of array: ");
        array[y] = readUser.nextInt();
      }
      int max = array[0];
      int min = array[0];
      for(int y=0; y<n; y++){
        if (array[y] <= min){
          min = array[y];
        }
        if (array[y] >= max){
          max = array[y];
        }
      }
      System.out.println(max+min);
    }
    readUser.close();
  }
}
