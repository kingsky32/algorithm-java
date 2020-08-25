package updated;

public class HeapSort {
	
	public static int[] arr;
	
	public static void heapSort(int[] arr, int number) { 
		for(int i = 1; i < number; i++) {
			int child = i;
			while(child > 0) {
				int parent = (child-1)/2;
				if(arr[child] > arr[parent]) {
					int temp = arr[parent];
					arr[parent] = arr[child];
					arr[child] = temp; 
				}
				child = parent;
			}
		} 
	}

	public static void main(String[] args) {
		arr = new int[]{1, 9, 8, 5, 4, 2, 3, 7, 6};
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
		
		System.out.println("");
		System.out.println("");
		System.out.println("##############");
		System.out.println("Heap Sort");
		System.out.println("##############");
		System.out.println("");
		
		heapSort(arr, arr.length);
		
		for(int i = arr.length - 1; i > 0; i--) {
			int temp = arr[0]; 
			arr[0] = arr[i];
			arr[i] = temp; 
			heapSort(arr, i);
		}
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
	}

}
