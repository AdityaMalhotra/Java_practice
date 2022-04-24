public class Encryption
{
    public static void main(String[] args) {
        String s = "chillout";
        System.out.println("Encrypted :" + encryption(s));
    }
    // Complete the encryption function below.
    static String encryption(String s) {
        String result = "";
        //Ensuring No spaces
        String[] str = s.trim().split("\\s+");
        s = "";
        for(String string : str)
        {
            s+=string;
        }

        int rows = (int)Math.floor(Math.sqrt(s.length()));
        int cols = (int)Math.ceil(Math.sqrt(s.length()));
        System.out.println("Rows : " + rows);
        System.out.println("Colums : " + cols);

        if(rows*cols <s.length())
            if(rows>cols)
                cols++;
            else if (cols>rows)
                rows++;

        String[][] matrix = new String[cols][rows];
        int k =0;
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                if(k<s.length()) {
                    matrix[j][i] = "" + s.charAt(k);
                }
                else
                    matrix[j][i] = "";
                System.out.print(matrix[j][i]);
                k++;
            }
            System.out.println();
        }
        for(int j = 0;j<cols;j++)
        {
            for(int i = 0;i<rows;i++)
            {
                result+= matrix[j][i];
            }
            result+=" ";
        }
        return result.trim();
    }
}
