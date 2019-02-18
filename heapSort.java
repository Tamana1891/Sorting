
class Main
{
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i=n/2-1; i>=0 ; i--)
            heapUtil(arr , n ,i);
    }
 
    void heapUtil(int arr[], int n, int i)
    {
        // Your code here
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;
        
        if(l<n && arr[l] > arr[largest])
            largest = l;
        
        if(r<n && arr[r] > arr[largest])
            largest = r;
            
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            
            heapUtil(arr ,n ,largest);
        }
    }
 }