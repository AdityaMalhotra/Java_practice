package Arrays;

public class DynamicArray<String>
{
    private Object[] data;
    private int size;
    private int capacity;

    public DynamicArray(int initialCapacity)
    {
        this.capacity = initialCapacity;
        this.data = new Object[initialCapacity];
    }

    public String get(int index)
    {
        return (String)this.data[index];
    }

    public void set(int index,String value)
    {
        this.data[index] = value;
    }

    public void insert(int index, String value)
    {
        if(size == capacity)
            resize();
        for(int i=index;i<size;i++)
        {
            this.data[i+1] = this.data[i];
        }
        this.data[index] = value;
        size++;
    }

    public boolean isEmpty()
    {
        if(this.size <= 0)
            return true;

        return false;
    }
    public boolean contains(String value)
    {
        for(int i=0;i<size;i++)
        {
            if(this.data[i].equals(value))
                return true;
        }
        return false;
    }
    public void delete(int index)
    {
        if(size == capacity/2)
            resize();

        for(int i = index;i<size;i++)
        {
            this.data[i] = this.data[i+1];
        }
        size--;
    }
    private void resize()
    {
        if(size == capacity)
        {
            capacity = 2*capacity;
        }
        else
        {
            capacity = capacity/2;
        }
        Object[] obj = new Object[capacity];
        for(int i=0;i<size;i++)
        {
            this.data[i] = obj[i];
        }
        this.data = obj;
    }
}
