import java.util.*;

public class sort012 {
  public static void main(String[] args){
    Scanner readUser = new Scanner(System.in);
    System.out.print("enter the number of test cases: ");
    int t = readUser.nextInt();
    for(int i=0; i<t; i++){
      System.out.print("enter the size of the array: ");
      int n = readUser.nextInt();
      int array[] = new int[n];
      for(int j=0; j<n; j++){
        System.out.print("enter the element: ");
        array[j] = readUser.nextInt();
      }
      for(int j=0; j<n; j++){
        for(int k=j+1; k<n; k++){
          if(array[j] > array[k]){
            int temp = array[j];
            array[j] = array[k];
            array[k] = temp;
          }
        }
      }
      for(int j=0; j<n; j++){
        System.out.print(array[j] + " ");
      }
    }
    readUser.close();
  }
}
