import java.util.*;

public class sort012 {
  public static void main(String[] args){
    Scanner readUser = new Scanner(System.in);
    System.out.print("enter the number of test cases: ");
    int zero = 0;
    int one = 0;
    int two = 0;
    int t = readUser.nextInt();
    for(int i=0; i<t; i++){
      System.out.print("enter the size of the array: ");
      int n = readUser.nextInt();
      int array[] = new int[n];
      for(int j=0; j<n; j++){
        System.out.print("enter the element: ");
        array[j] = readUser.nextInt();
        if(array[j] == 0){
          zero = zero + 1;
        }
        else if(array[j] == 1){
          one = one + 1;
        }
        else {
          two = two + 1;
        }
      }
      for(int j=0; j<n; j++){
        if(j < zero){
            array[j] = 0;
        }
        else if(j< zero + one){
            array[j] = 1;
        }
        else if(j< zero + one + two){
            array[j] = 2;
        }
      }

      // for(int j=0; j<n; j++){
      //   for(int k=j+1; k<n; k++){
      //     if(array[j] > array[k]){
      //       int temp = array[j];                 // very very slow method useless!!!!!
      //       array[j] = array[k];                 // dont use such solutions
      //       array[k] = temp;
      //     }
      //   }
      // }
      
      for(int j=0; j<n; j++){
        System.out.print(array[j] + " ");
      }
    }
    readUser.close();
  }
}
