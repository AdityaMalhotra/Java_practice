public class RunningTimeOfAlgos
{
    public static void main(String[] args) {
        int[] arr = {2,1,3,1,2};
        System.out.println(runningTime(arr));
    }
    static int runningTime(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int value = arr[i];
            while (j >= 1 && arr[j - 1] > value) {
                count++;
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = value;
        }
        return count;
    }
}
