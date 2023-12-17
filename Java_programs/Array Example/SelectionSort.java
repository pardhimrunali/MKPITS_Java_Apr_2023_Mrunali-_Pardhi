class SelectionSort{
	
	public static void main(String args[]){
int arr[]={4,8,1,2,9};
int n=4;
  int i, j, small;  
      
    for (i = 0; i < n-1; i++)    // One by one move boundary of unsorted subarray  
    {  
        small = i; //minimum element in unsorted array  
          
        for (j = i+1; j < n; j++)  
        if (arr[j] < arr[small])  
            small = j;  
// Swap the minimum element with the first element  
    int temp = arr[small];  
    arr[small] = arr[i];  
    arr[i] = temp;  
    }  
for(int count=0;count<arr.length;count++)
{
	System.out.println(arr[count]);
}
}
}