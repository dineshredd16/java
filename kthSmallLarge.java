import java.util.ArrayList;

public class kthSmallLarge {
  public static void main(String[] args){
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(5);
    arr.add(6);
    arr.add(7);
    arr.add(2);
    int n = 4;
    int k = 4;
    for (int i=0; i<n; i++){
      for (int j=i+1; j<n; j++){
        if (arr.get(i) > arr.get(j)){
          int temp = arr.get(i);
          arr.set(i, arr.get(j));
          arr.set(j, temp);
        }
      }
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(arr.get(k-1));
		result.add(arr.get(n-k));
		System.out.println(result);
  }
}
