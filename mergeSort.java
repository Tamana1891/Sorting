
import java.util.*;
public class Main
{
  public void mergeSortUtil (int[]arr, int l, int mid, int r)
  {
    int size1 = mid - l + 1;
    int size2 = r - mid;

    int temp1[] = new int[size1];
    int temp2[] = new int[size2];

    for (int i = 0; i < size1; i++)
        temp1[i] = arr[l + i];
    for (int j = 0; j < size2; j++)
        temp2[j] = arr[mid + 1 + j];

    int i = 0;
    int j = 0;
    int k = l;
    while (i < size1 && j < size2)
      {
	if (temp1[i] <= temp2[j])
	  arr[k++] = temp1[i++];
	else
	  arr[k++] = temp2[j++];
      }

    while (i < size1)
        arr[k++] = temp1[i++];

    while (j < size2)
      arr[k++] = temp2[j++];
  }

  public void mergeSort (int[]arr, int l, int r)
  {
      if(l<r){
	    int mid = (l + r) / 2;
	    mergeSort (arr, l, mid );
	    mergeSort (arr, mid + 1, r);

	    mergeSortUtil (arr, l, mid, r);
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

    obj.mergeSort (arr, 0, size - 1);

    for (int j = 0; j < size; j++)
      System.out.print (arr[j] + " ");
  }
}
