import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Student extends Object
{
    public String name;
    public int marks;

    @Override
    public boolean equals(Object s)
    {
        return (this.name.equals(((Student)s).name) && this.marks == ((Student)s).marks);
    }
    @Override
    public int hashCode() {
        return marks;
    }
}
public class StudentRecord
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());

            HashMap<Student,Integer> hashMap = new HashMap<Student,Integer>();

            for(int i=0;i<n;i++)
            {
                String[] input = br.readLine().trim().split("\\s+");
                Student stud = new Student();
                stud.name = input[0];
                stud.marks = Integer.parseInt(input[1]);

                if(hashMap.containsKey(stud))
                    hashMap.put(stud,hashMap.get(stud) + 1);
                else
                    hashMap.put(stud,1);
            }
            List<Map.Entry<Student,Integer>> entryList = new ArrayList<Map.Entry<Student, Integer>>(hashMap.entrySet());
            Collections.sort(entryList, new Comparator<Map.Entry<Student, Integer>>() {
                @Override
                public int compare(Map.Entry<Student, Integer> o1, Map.Entry<Student, Integer> o2) {
                    if(o1.getKey().name.compareTo(o2.getKey().name)==0)
                    {
                        if(o1.getValue() > o2.getValue())
                        {
                            return -1;
                        }
                        else if(o2.getValue()>o1.getValue())
                            return 1;
                        else
                            return o1.getKey().marks>o2.getKey().marks?-1:1;
                    }
                    else
                        return o1.getKey().name.compareTo(o2.getKey().name);
                }
            });
            for(Map.Entry<Student,Integer> entry : entryList )
            {
                System.out.println(entry.getKey().name + " " + entry.getKey().marks + " " + entry.getValue());
            }
        }
    }
}
