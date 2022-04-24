public class ElectronixShop
{
    public static void main(String[] args) {
        int b = 5;
        int[] keyboard = {4};
        int[] drives = {5};
        System.out.println(getMoneySpent(keyboard,drives,b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       int max = -1;
       int price;
       boolean flag;
       for(int i = 0;i<keyboards.length;i++)
       {
           if(keyboards[i]<b) {
               price = 0;
               flag = false;
               price = price + keyboards[i];
               System.out.println("Price before : " + price);
               for (int j = 0; j < drives.length; j++) {
                   if (price + drives[j] <=b) {
                       price = price + drives[j];
                       System.out.println("Price after" + price);
                       flag = true;
                       if (price > max) {
                           max = price;
                       }
                   }
                   price = keyboards[i];
               }
           }
       }
       return max;

    }
}
