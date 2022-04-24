package FractionalKnapsack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Inputs
        int allowedWeight = Integer.parseInt(br.readLine().trim());
        String[] values = br.readLine().trim().split("\\s+");
        String[] weights = br.readLine().trim().split("\\s+");

        ArrayList<Item> arrItem = new ArrayList<Item>();
        for(int i=0;i<values.length;i++)
        {
            arrItem.add(new Item(Integer.parseInt(values[i]),Integer.parseInt(weights[i])));
        }
        Collections.sort(arrItem,Collections.reverseOrder());

        int currWeight = 0;
        double result = 0d;
        for(Item item : arrItem)
        {
            if(currWeight + item.weight <= allowedWeight)
            {
                result+= item.value;
                currWeight+=item.weight;
                System.out.println(item.value);
            }
            else
            {
                double fraction = (double)(allowedWeight-currWeight)/(double)item.weight;
                result+= item.value * fraction;
                break;
            }
        }
        System.out.println(result);
    }
}
