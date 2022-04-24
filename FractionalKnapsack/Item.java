package FractionalKnapsack;

public class Item implements Comparable<Item>
{
    public int value;
    public int weight;

    public Item(int value,int weight)
    {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }

    public int compareTo(Item that)
    {
        if(this.value/this.weight > that.value/that.weight)
            return 1;
        else if (this.value/this.weight == that.value/that.weight)
            return 0;
        else
            return -1;
    }
}
