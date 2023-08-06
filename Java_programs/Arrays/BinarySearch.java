class BinarySearch{
public static void main(String args[])
{
int array[]={1,2,3,8,9};
int min=0;
int max=4;
int search=1;
int mid=min+max/2;
if(array[mid]==search){
System.out.println("Number is found");
}
else if(array[mid]<search){
	min=mid+1;
	System.out.println("Number is found");
	
	
	
}
else
{
	max=mid-1;
	System.out.println("Number is found");
}
}
}