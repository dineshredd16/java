import java.util.*;

public class seperateNegAndPos {
  public static void main(String[] args){
    Scanner readUser = new Scanner(System.in);
    ArrayList<Integer> nums = new ArrayList<Integer>();
    ArrayList<Integer> negArr = new ArrayList<Integer>();
    ArrayList<Integer> posArr = new ArrayList<Integer>();
    ArrayList<Integer> result = new ArrayList<Integer>();
    nums.add(1);
    nums.add(-4);
    nums.add(-2);
    nums.add(5);
    nums.add(3);
    int n = nums.size();
    for(int i=0; i<n; i++){
        int temp = nums.get(i);
        if (temp < 0){
            negArr.add(temp);
        }
        else {
            posArr.add(temp);
        }
    }
    // int negArrsize = negArr.size();
    // for(int i=0; i<n; i++){
    //     if(i < negArrsize){                              // this solution is a waste idea!!!!
    //         result.add(negArr.get(i));
    //     }
    //     else {
    //         result.add(posArr.get(n-i-1));
    //     }
    // }
    result.addAll(negArr);
    result.addAll(posArr);
    System.out.println(result);
    // System.out.println(negArr.addAll(posArr));
    readUser.close();
  }
}
