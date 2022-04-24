public class InsertionSortP1
{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,1};
        insertionSort1(arr.length,arr);
    }
    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int number = arr[n-1];
        if(arr[0]>number)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(j!=0) {
                    arr[j] = arr[j - 1];
                }
                if(j==0)
                {
                    arr[j] = number;
                }
                for(int k=0;k<n;k++)
                {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<number && arr[i+1]>=number)
            {
                for(int j=n-1;j>=i+1;j--)
                {
                    arr[j] = arr[j-1];
                    if(j==i+1)
                    {
                        arr[j] = number;
                    }
                    for(int k=0;k<n;k++)
                    {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
