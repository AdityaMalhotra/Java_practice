public class InsertionSortPart2
{
    public static void main(String[] args) {
        int[] arr = {3,4,7,5,6,2,1};
        insertionSort2(arr.length,arr);
    }
    // Complete the insertionSort2 function below.
    static void insertionSort2(int n, int[] arr) {
            for(int i=1;i<n;i++)
            {
                int j=i;
                int value = arr[i];
                while(j>=1 && arr[j-1]>value)
                {
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = value;
                for(int k = 0;k<n;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
    }
}
