import java.util.*;
public class Main
{
    public static void convert(int x)
    {
        int H = x/60;
        int M = x%60;
        System.out.println(H+" Hour(s) "+M+" Minute(s)");
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        convert(n);
    }
}