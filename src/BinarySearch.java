
public class BinarySearch {

	public static void main(String[] args) {
		int[] ints = { 1, 2, 3, 4, 5, 7};
		
		System.out.println(binarySearch(ints, 4));

	}
	
	private static int binarySearch(int[] numbers, int  target) {
		int low = 0;
		int high = numbers.length - 1;
		
		while(low<=high) {
			int midposition = (low+high)/2;
			int mid = numbers[midposition];
			
			if(mid == target) {
				return midposition;
			}
			if(target<mid) {
				high = midposition - 1;
			}
			else {
				low = midposition + 1;
			}
			
		}
		return -1;
	}
}
