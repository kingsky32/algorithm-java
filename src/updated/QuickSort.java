package updated;

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        quickSort(arr, low, mid - 1);
        quickSort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) low++;
            while (arr[high] > pivot) high--;
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }
	
	
	public static void main(String[] args) {
		int[] arr = {3, 5, 6, 2, 1, 6, 9};
		
		for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
		
		System.out.println("");
		System.out.println("");
		System.out.println("##############");
		System.out.println("Quick Sort");
		System.out.println("##############");
		System.out.println("");
		
		quickSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
	}

}
