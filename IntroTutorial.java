public class IntroTutorial
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(introTutorial(10,arr));
    }
    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {
        int first = 0;
        int last = arr.length;
        int mid;
        while(first!=last)
        {
            mid = (first+last)/2;
            if(arr[mid] == V)
            {
                return mid;
            }
            else if (arr[mid]<V)
            {
                first = mid+1;
            }
            else
            {
                last = mid;
            }
        }
        return -1;
    }
}
