package updated;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
	    for(int i = 0; i < arr.length; i++) {
	        for(int j = 0; j < arr.length - i - 1; j++) {
	            if(arr[j] > arr[j + 1]) {
	                int temp = arr[j + 1];
	                arr[j + 1] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		int[] arr = {3, 5, 6, 2, 1, 6, 9};
		
		for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
		
		System.out.println("");
		System.out.println("");
		System.out.println("##############");
		System.out.println("Bubble Sort");
		System.out.println("##############");
		System.out.println("");
		
		bubbleSort(arr);
		
		for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
	}

}
