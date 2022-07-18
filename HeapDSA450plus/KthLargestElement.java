package HeapDSA450plus;

public class KthLargestElement {
	public static void buildHeap(int []arr,int n,int k) {
		for(int i=n/2-1;i>=0;i--) heapify(arr,i,n);
		
		for(int i=n-1;k>0 && i>0;k--,i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			if(k==1) System.out.println(temp);
			heapify(arr,i,0);
			
		}
		
	}
	static void heapify(int[] arr,int n,int i) {
		int largest = i ; 
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && arr[l] > arr[largest]) largest = l ; 
		
		if(r<n && arr[r]>arr[largest]) largest = r; 
		
		if(largest != i ) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr,n,largest);
		}
	}
	public static void main(String[] args) {
		int arr[] = { 17, 15, 8, 9 ,6 ,5 ,10 ,4 ,8 ,3 ,1};
		buildHeap(arr,arr.length,3);
		
	}
}
