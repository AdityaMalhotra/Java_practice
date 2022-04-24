package unionFind;

public class WeightedQuickUnionUF
{
    private int id[];
    private int size[];

    public WeightedQuickUnionUF(int n)
    {
        id = new int[n];
        for(int i=0;i<n;i++)
            id[i] = i;
    }
    private int root(int i)
    {
        while(id[i]!=i)
            i = id[i];
        return i;
    }
    private boolean connected(int p,int q)
    {
        return root(p)==root(q);
    }

}
