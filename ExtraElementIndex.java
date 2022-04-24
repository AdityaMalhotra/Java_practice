public class ExtraElementIndex
{
    public int findExtra(int a[],int b[],int n)
    {
        int first = 0;
        int last = n-1;
        int mid;
        int index = 0;
        while(first<=last)
        {
            mid = (first + last)/2;
            if(a[mid]==b[mid])
            {
                first = mid+1;
            }
            else
            {
                last = mid-1;
                index = mid;
            }
        }
        return index;
    }
}
