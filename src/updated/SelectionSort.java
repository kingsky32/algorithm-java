package updated;

public class SelectionSort {
	
	public static void selectionSort (int[] arr) {
		int min;
		int temp;
		
		for(int i = 0; i < arr.length - 1; i++) {
            min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
	}
	
	public static void main(String [] args) {
		int[] arr = {3, 5, 6, 2, 1, 6, 9};
		
		for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
		
		System.out.println("");
		System.out.println("");
		System.out.println("##############");
		System.out.println("Selection Sort");
		System.out.println("##############");
		System.out.println("");
		
		selectionSort(arr);
		
		for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
	}
	
}
