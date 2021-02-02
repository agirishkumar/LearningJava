public class InsertionSort {
    void sort(int arr[]){
        int n = arr.length;
        for (int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && key<arr[j]){
                //Swap
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
                j--;
            }
        }
    }
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }


    public static void main(String args[])
    {
        InsertionSort ob = new InsertionSort();
        int arr[] = { 12, 11, 13, 5, 6 };
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
