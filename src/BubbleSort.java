public class BubbleSort {
    void bubbleSort(int arr[]){
        int n =  arr.length;
        for (int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    void printArray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        int arr[] = {2,5,7,8,12};
        obj.bubbleSort(arr);
        System.out.println("Bubble Sorted Array: ");
        obj.printArray(arr);
    }
}
