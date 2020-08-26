package updated;

public class CountingSort {
	
	public static int[] countingSort(int[] arr) {
		int max = arr[0];
		int result[] = new int[arr.length];
		
		for (int i = 0; i < arr.length - 1; i ++)
			if (arr[i] > max)
				max = arr[i];
		
		int[] counter = new int[max + 1];
		
		for (int i = 0; i <= arr.length - 1; i ++)
			counter[arr[i]] ++;
		
		for (int i = 1; i < counter.length; i++)
            counter[i] += counter[i - 1];
		
		for (int i = arr.length - 1; i >= 0; i --)
			result[--counter[arr[i]]] = arr[i];
		
		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 3, 0, 2, 3, 0, 3 };
		
		int[] soltArr = countingSort(arr);
		
		for(int i = 0; i < arr.length; i++) {
            System.out.print(soltArr[i]);
        }
	}

}
