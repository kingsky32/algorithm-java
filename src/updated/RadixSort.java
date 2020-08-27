package updated;

public class RadixSort {
	
	public static void countSort(int[] arr, int exp) {
		int[] output = new int[arr.length];
		int[] count = new int[10];
		for(int i = 0; i < arr.length; i++)
			count[(arr[i]/exp)%10]++;
		for(int i = 1; i < 10; i++)
			count[i] += count[i-1];
		for(int i = arr.length - 1; i >= 0; i--) {
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--; 
		}
		for(int i = 0; i < arr.length; i++)
			arr[i] = output[i];
	}
	
	public static void radixSort(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length - 1; i ++)
			if (arr[i] > max)
				max = arr[i];
		
		for (int i = 1; max/i > 0; i *= 10)
			countSort(arr, i);
	}

	public static void main(String[] args) {
		int[] arr = {30, 50, 65, 24, 13, 62, 91};
		
		radixSort(arr);
		
		for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
	}

}
