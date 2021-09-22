
import java.io.*;


//Solution 1 
// This solution space complexity is O(1) and time complexity is O(logn)
class GFG
{
static int search(int ar[],int size)
{
	int a = 0, b = size - 1;
	int mid = 0;
	while ((b - a) > 1)
	{
		mid = (a + b) / 2;
		if ((ar[a] - a) != (ar[mid] - mid))
			b = mid;
		else if ((ar[b] - b) != (ar[mid] - mid))
			a = mid;
	}
	return (ar[a] + 1);
    
  		
  
}
  
 //Solution 2 
//This solution space complexity is O(1) and time complexity is O(n)
  class GFG
{
static int search(int ar[],int size)
{
  int missing = size + 1 ;
        for (int i = 0; i < size; i++) {
            missing ^= (i + 1) ^ ar[i];
        }
        return missing;
  
  }
	  
	  //Soution 3 
	  while(low<=high)
        	{
            	int mid = low + (high-low)/2;
            	if(mid==0 || arr[mid]-1 != arr[mid-1])
                	return arr[mid]-1;
            	else if(arr[mid]+1 != arr[mid+1])
                	return arr[mid]+1;
            	if(arr[mid]-mid > 1)
                	high=mid-1;
            	else
                	low=mid+1;
        	}
        	return -1;
  
  
