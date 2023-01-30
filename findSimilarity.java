import java.util.*;
public class findSimilarity {
  public static void main(String[] args){
    Scanner readUser = new Scanner(System.in);
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arr1Clone = new ArrayList<Integer>();
    ArrayList<Integer> arr2 = new ArrayList<Integer>();
    ArrayList<Integer> arr2Clone = new ArrayList<Integer>();
    ArrayList<Integer> common = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
    int n = 5;
    int m =4;
    arr1.add(1);
    arr1.add(2);
    arr1.add(3);
    arr1.add(4);
    arr1.add(5);
    arr2.add(2);
    arr2.add(4);
    arr2.add(6);
    arr2.add(8);
    arr1Clone.addAll(arr1);
    arr2Clone.addAll(arr2);
		for(int i=0; i<n; i++){
			for(int j=0; j<m; j++){
				if(arr1.get(i) == arr2.get(j)){
					common.add(arr1.get(i));
          arr1Clone.remove(new Integer(arr1.get(i)));
          arr2Clone.remove(new Integer(arr2.get(j)));
					break;
				}
			}
		}
		result.add(common.size());
		common.addAll(arr1Clone);
		common.addAll(arr2Clone);
		result.add(common.size());
		System.out.println(result);
    readUser.close();
  }
}
