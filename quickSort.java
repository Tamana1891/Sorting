
import java.util.*;
public class Main
{
    public void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
    
  public int partition(int[] arr , int low , int high){
      int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
             
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
      
  }

  public void quickSort (int[]arr, int l, int h)
  {
    if(l<h){
	    int pivot = partition(arr , l , h);
	    quickSort(arr , l  , pivot-1);
	    quickSort(arr , pivot+1 , h);
      }
  }

  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
    Main obj = new Main ();
    int size = s.nextInt ();
    int[] arr = new int[size];
    for (int i = 0; i < size; i++)
      arr[i] = s.nextInt ();

    obj.quickSort (arr, 0, size-1 );

    for (int j = 0; j < size; j++)
      System.out.print (arr[j] + " ");
  }
}
