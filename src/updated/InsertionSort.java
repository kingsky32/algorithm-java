package updated;

public class InsertionSort {

	public static void insertionSort(int[] arr){
        int temp = 0;
        int j = 0;
        for(int i = 1; i < arr.length; i++){
            temp = arr[i];
            for(j=i-1; j>=0 && temp< arr[j]; j--){
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
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
		System.out.println("Insertion Sort");
		System.out.println("##############");
		System.out.println("");
		
		insertionSort(arr);
		
		for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
	}

}
